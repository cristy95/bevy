/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*
*
* Author Of This Original Software : Sandeep Soni [ Sandeep.Soni at gmail dot com ]
* With Active Contributions from Murali Krishna Reddy

* Do Let Me Know by Email if you used the software and found it useful.
*
*/
package com.sun.portal.portlets.wss.formatters;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA. User: root Date: Sep 1, 2006 Time: 12:14:00 PM To
 * change this template use File | Settings | File Templates.
 */
public class DocIconFormatter implements InterfaceFormatter {

    public String getFormattedValue(String listSoapAddress, String listName, String RootFolder, String fieldValue, String id, HashMap formatterVariables) {
	// //System.out.println("The value which should be inspected" +
        // fieldValue);
	String modstr = "";
	// if (fieldValue.equals("jpg") || fieldValue.equals("gif") ||
        // fieldValue.equals("png") || fieldValue.equals("bmp")) {
	// // modstr = pres.encodeURL(preq.getContextPath() +
        // "/images/img.gif");
	// } else {
	// // modstr = pres.encodeURL(preq.getContextPath() +
        // "/images/doc.gif");
	// }
	// String link = "<a <IMG SRC=\"" + modstr + "\">" + "</a>";
	// //System.out.println("entered doc icon formmater" + link);
	// return link;
	if (formatterVariables.containsKey(fieldValue)) {
	    modstr = (String) formatterVariables.get(fieldValue);
	} else {
	    modstr = (String) formatterVariables.get("other");
	}
	String link = "<a <IMG SRC=\"" + modstr + "\">" + "</a>";
	return link;
    }

}
