package allure;

import ru.yandex.qatools.allure.Allure;
import ru.yandex.qatools.allure.data.AllureAttachment;
import ru.yandex.qatools.allure.data.AllureStep;
import ru.yandex.qatools.allure.data.AllureTestCase;
import ru.yandex.qatools.allure.data.plugins.DefaultTabPlugin;
import ru.yandex.qatools.allure.data.plugins.Plugin;
import ru.yandex.qatools.allure.model.Label;

import java.util.ArrayList;
import java.util.List;

@Plugin.Name("browserList")
public class BrowserInfo extends DefaultTabPlugin {

    @Override
    public void process(AllureTestCase data) {

    }

}

