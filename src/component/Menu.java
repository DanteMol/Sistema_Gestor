
package component;

import event.EventMenu;
import event.EventMenuSelected;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import model.ModelMenu;
import net.miginfocom.swing.MigLayout;
import swing.scrollbar.ScrollBarCustom;
import swing.swing.MenuAnimation;
import swing.swing.MenuItem;

public class Menu extends javax.swing.JPanel {

    public void addEvent(EventMenuSelected event) {
        this.event = event;
    }

    public void setEnableMenu(boolean enableMenu) {
        this.enableMenu = enableMenu;
    }

    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }

    private final MigLayout layout;
    private EventMenuSelected event;
    private boolean enableMenu = true;
    private boolean showMenu = true;
    
    public Menu() {
        initComponents();
        setOpaque(false);
        sp.getViewport().setOpaque(false);
        sp.setVerticalScrollBar(new ScrollBarCustom());
        layout = new MigLayout("wrap, fillx, insets 0","[fill]","[]0[]");
        panel.setLayout(layout);
    }
    
    public void initMenuItem(){
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/1.png")), "Empleado", "Altas", "Bajas", "Entradas", "Salidas"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/2.png")), "Seguro","Beneficiarios", "Tipos de seguros","Seguro del empleado"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/3.png")), "Reporte", "Nomina", "-", "-"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/4.png")), "Bajas", "Baja empleado","Historial de bajas"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/5.png")), "- -", "-", "-", "-"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/6.png")), "- -", "- -", "- -", "- -"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/7.png")), "- -", "- -", "- -", "- -"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/8.png")), "- -", "- -", "- -", "- -"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/9.png")), "- -", "- -", "- -", "- -"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/10.png")), "- -", "- -", "- -", "- -"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/11.png")), "- -", "- -", "- -", "- -"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/12.png")), "- -", "- -", "- -", "- -"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/13.png")), "- -"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/icon/14.png")), "- -"));
    }
    
    private void addMenu(ModelMenu menu){
        panel.add(new MenuItem(menu,getEventMenu(),event, panel.getComponentCount()), "h 40!");
    }
    
    private EventMenu getEventMenu(){
        return new EventMenu(){
          @Override
          public boolean menuPressed(Component com, boolean open){
              if(enableMenu){
                  if(showMenu){
                      if(open){
                          new MenuAnimation(layout, com).openMenu();
                      }else{
                          new MenuAnimation(layout, com).closeMenu();
                      }
                      return true;
                  }else{
                      System.out.println("Show pop up menu (Menu is close)");
                  }
              }
              return false;
          }
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(159, 34, 65));
        setPreferredSize(new java.awt.Dimension(250, 523));

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setPreferredSize(new java.awt.Dimension(214, 603));

        panel.setOpaque(false);
        panel.setPreferredSize(new java.awt.Dimension(100, 600));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        sp.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2= (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0,0,new Color(159,34,65),getWidth(),0,new Color(159,34,65));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
