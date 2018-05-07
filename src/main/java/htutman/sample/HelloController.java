package htutman.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Simple MVC controller <em>"Hello World!"</em> example.
 *
 * @author Hrvoje Tutman
 */
@RequestMapping(value = "/")
@Controller
public class HelloController {

  /**
   * REST end-point for <strong>/hello</strong> requests returning {@link Message} object.
   *
   * @return new {@link Message} object
   */
  @RequestMapping(value = "/hello")
  @ResponseBody
  public Message printHello() {
    return new Message("Hello World!");
  }
}
