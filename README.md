# Browser Support

Some Vaadin addons do not bring any IE support, which actually isn't too much of a problem since actually only <3% use it. But instead of presenting the users an unusable UI, it is a better idea to tell them right at the first visit that your application does not support the browser of their choice. 

This addon allows to tell this the user easily and also motivates them to download another browser and asks to visit the website again.

## Development instructions

Starting the test/demo server:
```
mvn jetty:run
```

This deploys demo at http://localhost:8080

### Branching information

* `master` the latest version of the starter, using latest platform snapshot
* `V10` the version for Vaadin 10
* `V11` the version for Vaadin 11
