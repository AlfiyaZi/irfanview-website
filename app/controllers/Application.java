package controllers;

import play.mvc.*;
import views.html.index;
import views.html.download;
import views.html.faq;
import views.html.about;
import views.html.niceSites;


public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    public static Result download() {
        return ok(download.render());
    }

    public static Result faq() {
        return ok(faq.render());
    }

    public static Result about() {
        return ok(about.render());
    }

    public static Result niceSites() {
        return ok(niceSites.render());
    }

}
