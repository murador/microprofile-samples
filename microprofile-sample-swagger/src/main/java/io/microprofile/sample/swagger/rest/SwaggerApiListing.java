/*
 * Copyright 2016 Hammock and its contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.microprofile.sample.swagger.rest;

import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.ws.rs.Path;

@RequestScoped
@Path("/swagger.{type:json|yaml}")
public class SwaggerApiListing extends ApiListingResource {
    @Produces
    @RequestScoped
    private SwaggerSerializers serializers = new SwaggerSerializers();
}
