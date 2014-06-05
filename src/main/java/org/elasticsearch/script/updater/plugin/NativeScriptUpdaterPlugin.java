package org.elasticsearch.script.updater.plugin;

import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.script.ScriptModule;
import org.elasticsearch.script.updater.UpdaterScript;

public class NativeScriptUpdaterPlugin extends AbstractPlugin {

    @Override
    public String name() {
        return "native-script-updater";
    }

    /**
     * The description of the plugin.
     *
     * @return plugin description
     */
    @Override
    public String description() {
        return "Elasticsearch native script updater";
    }

    public void onModule(ScriptModule module) {
        // Register each script that we defined in this plugin
        module.registerScript(UpdaterScript.SCRIPT_NAME, UpdaterScript.Factory.class);
    }
}
