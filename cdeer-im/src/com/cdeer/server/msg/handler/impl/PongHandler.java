package com.cdeer.server.msg.handler.impl;

import io.netty.channel.Channel;

import com.cdeer.protobuf.CdeerMsg.Message;
import com.cdeer.server.msg.handler.AppMsgHandler;

/**
 * 心跳响应处理器
 * 
 * @author jacklin
 * 
 */
public class PongHandler implements AppMsgHandler{

	@Override
	public void process(Channel channel, Message msg2) {
		
	}

}
