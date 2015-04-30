package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/")
public class EventController {
	@Autowired
	private EventDao eventDao;

	@RequestMapping
	public Iterable<Event> list() {
		return eventDao.findAll();
	}

	@RequestMapping(method = POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void insert(@RequestBody Event event) {
		eventDao.save(event);
	}
}
