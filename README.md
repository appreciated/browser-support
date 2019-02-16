# Browser Support

Some Vaadin addons do not bring any IE support, which isn't too much of a problem since actually only <3% use it. But instead of presenting the users an unusable UI, it might be a good idea to tell them that your application does not support it anymore. 

This addon allows to tell this the user easily, motivates the user to download another browser and ask them to visit the website again.

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
