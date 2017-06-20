import java.lang.reflect.Array;
import java.net.URLClassLoader;

public class PluginManager {
    private final String pluginRootDirectory;

    public PluginManager(String pluginRootDirectory) {
        this.pluginRootDirectory = pluginRootDirectory;
    }

    public Plugin load(String pluginName, String pluginClassName) {
        ClassLoader classLoader = new URLClassLoader(new Array[] {pluginRootDirectory});
        return new Plugin() {
            @Override
            public void doUsefulьь     l() {

            }
        };
    }
}
