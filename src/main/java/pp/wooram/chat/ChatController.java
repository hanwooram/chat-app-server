package pp.wooram.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import pp.wooram.chat.message.Message;

@Controller
public class ChatController {
	@MessageMapping("/message/{roomId}")
	@SendTo("/topic/content/{roomId}")
	public Message message(Message message) throws Exception {
		// if (!message.getChatRoom().getId().equals(Long.valueOf(roomId))) {
		// throw new InvalidParameterException("잘못된 채팅방으로 메세지 전송이 시도 되었습니다.");
		// }
		return message;
	}
}
