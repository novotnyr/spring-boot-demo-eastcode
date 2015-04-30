package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/events")
public class EventHtmlController {
	@Autowired
	private EventDao eventDao;

	@RequestMapping
	public ModelMap list() {
		Iterable<Event> events = eventDao.findAll();
		ModelMap model = new ModelMap("events", events);

		return model;
	}
}
