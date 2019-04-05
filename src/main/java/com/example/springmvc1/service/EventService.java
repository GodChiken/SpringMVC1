package com.example.springmvc1.service;

import com.example.springmvc1.model.Event;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

	public List<Event> getEvents() {
		Event event = Event.builder()
				.name("스터디 1차")
				.limitOfEnrollment(5)
				.startLocalDateTime(LocalDateTime.of(2019, 1, 10, 10, 0))
				.endLocalDateTime(LocalDateTime.of(2019, 1, 10, 12, 0))
				.build();
		Event event2 = Event.builder()
				.name("스터디 2차")
				.limitOfEnrollment(5)
				.startLocalDateTime(LocalDateTime.of(2019, 1, 10, 10, 0))
				.endLocalDateTime(LocalDateTime.of(2019, 1, 10, 12, 0))
				.build();
		/*TODO: WIKI -> Java 9 이상에서는 List.of() 메서드를 활용하여 불변객체를 생성한다. 10개까지 가능*/
		List list = new ArrayList();
		list.add(event);
		list.add(event2);
		return list;
	}
}
