package pp.wooram.chat.room;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatRoom implements Serializable {
	private static final long serialVersionUID = 4791698152565060089L;

	private Long id;
	private String title;
	private int capacity;
}
