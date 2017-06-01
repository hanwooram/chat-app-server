package pp.wooram.chat;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pp.wooram.chat.room.ChatRoomService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatRoomServiceTest {
	@Autowired
	private ChatRoomService chatRoomService;
}
