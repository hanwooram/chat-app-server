package pp.wooram.chat.room;

import java.util.List;

public interface ChatRoomService {
	public List<ChatRoom> list();

	public ChatRoom save(ChatRoom chatRoom);
}
