package org.duniter.elasticsearch.action.market;

/*
 * #%L
 * duniter4j-elasticsearch-plugin
 * %%
 * Copyright (C) 2014 - 2016 EIS
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import org.duniter.elasticsearch.action.security.RestSecurityController;
import org.duniter.elasticsearch.service.MarketService;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.rest.RestRequest;

public class RestMarketCategoryAction {

    @Inject
    public RestMarketCategoryAction(RestSecurityController securityController) {
        // Add security rule for category
        securityController.allowIndexType(RestRequest.Method.GET, MarketService.INDEX, MarketService.RECORD_CATEGORY_TYPE);
    }

}