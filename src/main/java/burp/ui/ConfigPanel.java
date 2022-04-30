package burp.ui;

import javax.swing.*;

public class ConfigPanel extends JToolBar {
    JCheckBox autoSendRequestCheckBox;
    JCheckBox includeCookieCheckBox;
    JCheckBox noPassiveCheckBox;

    public ConfigPanel() {
        this.autoSendRequestCheckBox = new JCheckBox("Auto request sending");
        this.includeCookieCheckBox = new JCheckBox("Send with cookie");
        this.noPassiveCheckBox = new JCheckBox("No passive scan");

        // 默认不发送
        this.autoSendRequestCheckBox.setSelected(false);
        this.includeCookieCheckBox.setSelected(false);
        this.noPassiveCheckBox.setSelected(false);

        // 不可悬浮
        this.setFloatable(false);
        this.add(autoSendRequestCheckBox);
        this.add(includeCookieCheckBox);
        this.add(noPassiveCheckBox);
    }

    public Boolean getAutoSendRequest() {
        return this.autoSendRequestCheckBox.isSelected();
    }

    public Boolean getIncludeCookie() {
        return this.includeCookieCheckBox.isSelected();
    }

    public Boolean getNoPassive() {
        return this.noPassiveCheckBox.isSelected();
    }
}
