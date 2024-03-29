/*
 * Axelor Business Solutions
 * 
 * Copyright (C) 2019 Axelor (<http://axelor.com>).
 * 
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.sale.db.repo;

import com.axelor.apps.sale.db.SaleOrder;
import com.axelor.db.JpaRepository;

public class SaleOrderRepository extends JpaRepository<SaleOrder> {

	public SaleOrderRepository() {
		super(SaleOrder.class);
	}

	// STATUS

	public static final int STATUS_DRAFT_QUOTATION = 1;
	public static final int STATUS_FINALIZED_QUOTATION = 2;
	public static final int STATUS_ORDER_CONFIRMED = 3;
	public static final int STATUS_ORDER_COMPLETED = 4;
	public static final int STATUS_CANCELED = 5;
}

