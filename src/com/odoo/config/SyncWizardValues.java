/*
 * Odoo, Open Source Management Solution
 * Copyright (C) 2012-today Odoo SA (<http:www.odoo.com>)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http:www.gnu.org/licenses/>
 * 
 */
package com.odoo.config;

import java.util.ArrayList;
import java.util.List;

import com.odoo.addons.mail.providers.group.MailGroupProvider;
import com.odoo.addons.mail.providers.mail.MailProvider;
import com.odoo.support.SyncValue;
import com.odoo.support.SyncValue.Type;
import com.odoo.support.SyncWizardHelper;

public class SyncWizardValues implements SyncWizardHelper {

	@Override
	public List<SyncValue> syncValues() {
		List<SyncValue> list = new ArrayList<SyncValue>();
		list.add(new SyncValue("Messaging"));
		list.add(new SyncValue("Messages", MailProvider.AUTHORITY,
				Type.CHECKBOX));
		list.add(new SyncValue("Groups", MailGroupProvider.AUTHORITY,
				Type.CHECKBOX));
		return list;
	}
}
