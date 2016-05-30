package sample.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sample.domain.models.Hoge;

/**
 * Created by YamashiroRyota on 2016/05/31.
 */
@RestController
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping(value = "hoge", method = RequestMethod.GET)
    public Hoge hoge() {
        return new Hoge("aaa", "fuga");
    }

}
