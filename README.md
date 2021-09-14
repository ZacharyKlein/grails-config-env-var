# Grails Config via Env Var - Demo

```
export VAUlT_TOKEN='some token';
./gradlew bootRun;

...
token: some token
Grails application running at http://localhost:8080 in environment: development
```

Files of interest:
- grails-app/conf/application.yml
- grails-app/init/Bootstrap.groovy
