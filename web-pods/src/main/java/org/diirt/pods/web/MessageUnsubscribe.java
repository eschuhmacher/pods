/*
 * Copyright (C) 2010-14 diirt developers. See COPYRIGHT.TXT
 * All rights reserved. Use is subject to license terms. See LICENSE.TXT
 */

package org.diirt.pods.web;

import javax.json.JsonObject;

/**
 *
 * @author carcassi
 */
public class MessageUnsubscribe extends Message {

    public MessageUnsubscribe(JsonObject obj) {
        super(obj);
    }
    
}