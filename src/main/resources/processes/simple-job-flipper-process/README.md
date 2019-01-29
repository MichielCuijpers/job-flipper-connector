# Simple Job Flipper Process

## How to use this BPMN file with the Cloud Connector built in this repo

### 1. Connect up with the `JobFlipperConnector` class

Pay attention to the XML element:

```xml
<serviceTask id="sid-CDFE7219-4627-43E9-8CA8-866CC38EBA94" name="Job Starter Task" implementation="jobFlipperConnector">
    <incoming>sid-68945AF1-396F-4B8A-B836-FC318F62313F</incoming>
    <outgoing>sid-3C0516C4-1BF7-48F8-88CF-04C41810FE00</outgoing>
</serviceTask>
```

The part we care about is `implementation="jobFlipperConnector`.
The important thing here is that you negotiate that with whoever's writing the Cloud Connector.

You'd think it's the class name.
But it's not.
It's actually the name of the RabbitMQ channel that the integration message is sent over within the Runtime Bundle engine.

Have a look here in `src/main/resources/application.properties`:

```yaml
spring.cloud.stream.bindings.jobFlipperConsumer.destination=jobFlipperConnector
```

_That's_ where `jobFlipperConnector` is supposed to match to.

### 2. Pass in the Job id

The Job id must be passed as a global variable to the Integration Context of the Process when it is started.
That means if there are multiple `serviceTask` elements that all have the `implementation="sameThing"` tag, then they'll all see the same variables.
In order to provide each with their own variable, we name the variables after the ids of the Service Tasks they correspond to.

The format for Job id variable naming is:

```
"jobId::<serviceTaskId>"
```

So in our example above, in order to provide the `jobFlipperConnector` Service Task with its own Job id variable, when we start the Process,
we pass in the Job id keyed on the token:

```
"jobId::sid-CDFE7219-4627-43E9-8CA8-866CC38EBA94"
```

It may or may not go without saying that this method requires that each `serviceTask` element have its own unique `id`.

## How does the Parsable Workflows API wrap the Activiti Engine API?

That's still an open question.

For the time being, just know that you need to be able to:

1. add a custom `implementation` tag to each `serviceTask` element
2. pass the Job id to the Parsable API, keyed on the `serviceTask` element `id` tag
