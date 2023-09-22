package model;

import javax.swing.Icon;

public class ModelMenu {

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String[] getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(String[] subMenu) {
        this.subMenu = subMenu;
    }
    
    public ModelMenu(Icon icon, String menuName, String... subMenu){
        this.icon = icon;
        this.menuName = menuName;
        this.subMenu = subMenu;
        
    }
    
    public ModelMenu(String dashboard, String home, String buttons, String cards, String tabs, String accordions, String modals){
        
    }
    
    private Icon icon;
    private String menuName;
    private String subMenu[];
}
