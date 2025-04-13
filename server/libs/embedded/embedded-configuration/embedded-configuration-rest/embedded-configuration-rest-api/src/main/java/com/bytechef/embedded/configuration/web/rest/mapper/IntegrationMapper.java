/*
 * Copyright 2023-present ByteChef Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bytechef.embedded.configuration.web.rest.mapper;

import com.bytechef.embedded.configuration.domain.Integration;
import com.bytechef.embedded.configuration.dto.IntegrationDTO;
import com.bytechef.embedded.configuration.web.rest.mapper.config.EmbeddedConfigurationMapperSpringConfig;
import com.bytechef.embedded.configuration.web.rest.model.IntegrationBasicModel;
import com.bytechef.embedded.configuration.web.rest.model.IntegrationModel;
import org.mapstruct.AfterMapping;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.extensions.spring.DelegatingConverter;
import org.springframework.core.convert.converter.Converter;

/**
 * @author Ivica Cardic
 */
public class IntegrationMapper {

    @Mapper(config = EmbeddedConfigurationMapperSpringConfig.class)
    public interface IntegrationToIntegrationBasicModelMapper extends Converter<Integration, IntegrationBasicModel> {

        @AfterMapping
        default void afterMapping(Integration integration, @MappingTarget IntegrationBasicModel integrationBasicModel) {
            integrationBasicModel.setIcon("/icons/%s.svg".formatted(integration.getComponentName()));
        }

        @Override
        @Mapping(target = "icon", ignore = true)
        IntegrationBasicModel convert(Integration integration);
    }

    @Mapper(config = EmbeddedConfigurationMapperSpringConfig.class)
    public interface IntegrationDTOToIntegrationModelMapper extends Converter<IntegrationDTO, IntegrationModel> {

        @AfterMapping
        default void afterMapping(Integration integration, @MappingTarget IntegrationModel integrationModel) {
            integrationModel.setIcon("/icons/%s.svg".formatted(integration.getComponentName()));
        }

        @Override
        IntegrationModel convert(IntegrationDTO integrationDTO);

        @InheritInverseConfiguration
        @DelegatingConverter
        @Mapping(target = "integrationVersions", ignore = true)
        IntegrationDTO invertConvert(IntegrationModel integrationModel);
    }
}
