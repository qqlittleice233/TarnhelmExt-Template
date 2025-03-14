import android.os.Build;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import cn.ac.lz233.tarnhelm.ext.template.ExtServiceImpl;
import cn.ac.lz233.tarnhelm.extension.api.ExtContext;
import cn.ac.lz233.tarnhelm.extension.api.ExtService;
import cn.ac.lz233.tarnhelm.extension.api.ITarnhelmExt;

public class TarnhelmExt implements ITarnhelmExt {

    @Override
    public ExtInfo extensionInfo() {
        return new ExtInfoImpl();
    }

    // TODO: Change your own extension service
    @Override
    public ExtService createExtensionService(ExtContext extContext) {
        return new ExtServiceImpl(extContext);
    }

    // TODO: Change your own extension information
    private static class ExtInfoImpl implements ExtInfo {

        @NotNull
        @Override
        public String id() {
            return "cn.ac.lz233.tarnhelm.ext.example";
        }

        @Nullable
        @Override
        public String author() {
            return "lz233";
        }

        @NotNull
        @Override
        public String name() {
            return "Example Extension";
        }

        @Nullable
        @Override
        public String description() {
            return "An example extension";
        }

        @Nullable
        @Override
        public String extensionURL() {
            return "https://github.com/qqlittleice233/TarnhelmExt-Template";
        }

        @Override
        public int versionCode() {
            return 1;
        }

        @Nullable
        @Override
        public String versionName() {
            return "1.0.0";
        }

        @Override
        public boolean hasConfigurationPanel() {
            return false;
        }

        @Override
        public int minTarnhelmSdkVersion() {
            return 1;
        }

        @Override
        public int minAndroidSdkVersion() {
            return Build.VERSION_CODES.O_MR1;
        }

        @NotNull
        @Override
        public String[] regexes() {
            return new String[]{".*"};
        }
    }
}
