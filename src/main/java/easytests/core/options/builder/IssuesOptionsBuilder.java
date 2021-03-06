package easytests.core.options.builder;

import easytests.core.options.IssuesOptions;
import easytests.core.options.IssuesOptionsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fortyways
 */
@Service
public class IssuesOptionsBuilder implements IssuesOptionsBuilderInterface {

    @Autowired
    private SubjectsOptionsBuilder subjectsOptionsBuilder;

    @Autowired
    private QuizzesOptionsBuilder quizzesOptionsBuilder;

    @Override
    public IssuesOptionsInterface forAuth() {
        return new IssuesOptions().withSubject(subjectsOptionsBuilder.forAuth());
    }

    @Override
    public IssuesOptionsInterface forDelete() {
        return new IssuesOptions().withQuizzes(quizzesOptionsBuilder.forDelete());
    }
}
