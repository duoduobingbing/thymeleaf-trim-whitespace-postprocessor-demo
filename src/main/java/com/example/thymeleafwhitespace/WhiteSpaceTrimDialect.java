package com.example.thymeleafwhitespace;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.IPostProcessorDialect;
import org.thymeleaf.postprocessor.IPostProcessor;
import org.thymeleaf.postprocessor.PostProcessor;
import org.thymeleaf.templatemode.TemplateMode;

public class WhiteSpaceTrimDialect implements IPostProcessorDialect{

    final Set<IPostProcessor> processors = new HashSet<>(); 
    
    {
       processors.add(new PostProcessor(TemplateMode.HTML, WhiteSpacePostProcessor.class, Integer.MAX_VALUE));
    }
   

    @Override
    public String getName() {
        return "WhitespaceTrim";
    }

    @Override
    public int getDialectPostProcessorPrecedence() {
        return 0;
    }

    @Override
    public Set<IPostProcessor> getPostProcessors() {
        return processors;
    }
    
}
