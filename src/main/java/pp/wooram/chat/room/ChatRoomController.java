package pp.wooram.chat.room;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatRoomController {
	@Autowired
	private ChatRoomService chatRoomService;

	@RequestMapping(value = "/rooms", method = RequestMethod.GET)
	public List<ChatRoom> list() {		
		return chatRoomService.list();
	}

	@RequestMapping(value = "/room", method = RequestMethod.PUT)
	public ChatRoom register(@RequestBody ChatRoom chatRoom) {
		chatRoomService.save(chatRoom);
		return chatRoom;
	}
}
