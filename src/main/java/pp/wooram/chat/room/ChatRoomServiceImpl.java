package pp.wooram.chat.room;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service("chatRoomService")
public class ChatRoomServiceImpl implements ChatRoomService {
	@Autowired
	private RedisTemplate<String, ChatRoom> redisTemplate;

	// @Resource(name = "redisTemplate")
	// private ListOperations<Long, ChatRoom> listOps;

	@Override
	public List<ChatRoom> list() {
		return redisTemplate.opsForList().range("chatRooms", 0, -1);
	}

	@Override
	public ChatRoom save(ChatRoom chatRoom) {
		chatRoom.setId(new Date().getTime());
		redisTemplate.boundListOps("chatRooms").leftPush(chatRoom);
		return null;
	}
}
