import VendingMachines.*;
import Products.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrameVM extends JFrame {
    private VendingMachine vendingMachines;
    private DefaultListModel<Product> productListModel;
    private JList<Product> productList;
    private JTextField moneyInputField;
    private JButton bayButton;

    public MainFrameVM(VendingMachine vendingMachines) {
        super("Vending Machines");
        this.vendingMachines = vendingMachines;

        // создаем список продуктов
        productListModel = new DefaultListModel<>();
        for (Product product : vendingMachines.getProdAll()) {
            productListModel.addElement(product);
        }
        productList = new JList<>(productListModel);
        //создаем поле ввода наличности
        moneyInputField = new JTextField(10);
        //создаем кнопку "купить товар"
        bayButton = new JButton("Купить товар");
        bayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //получаем выбранный продукт и введенную наличность
                Product selectedProduct = productList.getSelectedValue();
                Double money = Double.parseDouble(moneyInputField.getText());

                //Покупаем продукт и выводим результат в диалоговом окне
                String result = vendingMachines.buy(selectedProduct, money);
                JOptionPane.showMessageDialog(MainFrameVM.this, result);
            }
        });
        // создаем панель для размещения элементов интерфейса
        JPanel panel = new JPanel(new BorderLayout());
        JLabel instructionLabel = new JLabel("выберите товар и введите сумму, затем нажмите ");
        panel.add(instructionLabel, BorderLayout.NORTH);
        panel.add(new JScrollPane(productList), BorderLayout.CENTER);
        panel.add(moneyInputField, BorderLayout.AFTER_LAST_LINE);
        panel.add(bayButton, BorderLayout.AFTER_LINE_ENDS);

        // добавляем панель на форму
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
