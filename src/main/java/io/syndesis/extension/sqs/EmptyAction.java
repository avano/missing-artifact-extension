package io.syndesis.extension.sqs;

import io.syndesis.extension.api.Step;
import io.syndesis.extension.api.annotations.Action;

import org.apache.camel.CamelContext;
import org.apache.camel.model.ProcessorDefinition;

import java.util.Map;
import java.util.Optional;

@Action(id = "empty", name = "empty", description = "Does nothing", tags = { "extension", "empty" })
public class EmptyAction implements Step {
    @Override
    public Optional<ProcessorDefinition<?>> configure(CamelContext camelContext, ProcessorDefinition<?> processorDefinition, Map<String, Object> map) {
        return Optional.empty();
    }
}
