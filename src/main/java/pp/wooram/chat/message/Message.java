package pp.wooram.chat.message;

import java.util.Date;

import lombok.Data;
import pp.wooram.chat.room.ChatRoom;
import pp.wooram.chat.user.User;

@Data
public class Message {
	private User user;
	private ChatRoom chatRoom;
	private String content;
	private Date writeTime;
}
