package rocks.cleanstone.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * The main Cleanstone server instance which coordinates all {@link CleanstoneSubServer} instances. There
 * currently are only main server instances.
 */
@SpringBootApplication
@Component("cleanstoneMainServer")
@Profile(value = "mainServer")
public class CleanstoneMainServer extends CleanstoneServer {

    @Autowired
    public CleanstoneMainServer() {
        super();
    }
}
