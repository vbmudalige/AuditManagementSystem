package audit_management;

import javax.swing.JOptionPane;

public class AccountantWindow extends javax.swing.JFrame {
    Login lg = new Login();
    AccountantHandler newHandler = new AccountantHandler();
    AccountantHandler handler;
    
    public AccountantWindow() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        ReceiptTab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        textPaymentID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textPaymentDate = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        textPaymentAmmount = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        textPaymentType = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        textPaymentDescription = new javax.swing.JTextField();
        PaymentSearchButton = new javax.swing.JButton();
        PaymentUpdateButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ReceiptSearchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textReceiptID = new javax.swing.JTextField();
        textReceiptDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textReceiptAmmount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textReceiptType = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textReceiptDescription = new javax.swing.JTextField();
        ReceiptUpdateButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        textEmployeeID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textFirstName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textLastName = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        textJobTitle = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        textSalary = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        textOtherDetails = new javax.swing.JTextField();
        EmployeeSearchButton = new javax.swing.JButton();
        UpdateEmployeeButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accountant Window");

        ReceiptTab.setBackground(new java.awt.Color(204, 204, 204));
        ReceiptTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        ReceiptTab.setToolTipText("Just enter the payment's ID and press this button");
        ReceiptTab.setFont(new java.awt.Font("Times New Roman", 1, 24));

        textPaymentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPaymentIDActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Payment ID");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Date (yy:mm:dd)");

        textPaymentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPaymentDateActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Amount (Rs.)");

        textPaymentAmmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPaymentAmmountActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Type");

        textPaymentType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPaymentTypeActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Description");

        textPaymentDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPaymentDescriptionActionPerformed(evt);
            }
        });

        PaymentSearchButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PaymentSearchButton.setText("Search");
        PaymentSearchButton.setToolTipText("Just enter the payment's ID and press this button");
        PaymentSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentSearchButtonActionPerformed(evt);
            }
        });

        PaymentUpdateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PaymentUpdateButton.setText("Update ");
        PaymentUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(411, 411, 411))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textPaymentID, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(380, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textPaymentDate, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(401, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textPaymentAmmount, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(456, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textPaymentType, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(415, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(PaymentSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                        .addComponent(PaymentUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textPaymentDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPaymentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPaymentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPaymentAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPaymentDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaymentSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaymentUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        ReceiptTab.addTab("Payments", jPanel2);

        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 14));

        ReceiptSearchButton.setFont(new java.awt.Font("Times New Roman", 1, 14));
        ReceiptSearchButton.setText("Search");
        ReceiptSearchButton.setToolTipText("Just enter the receipt's ID and press this button");
        ReceiptSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptSearchButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel2.setText("Receipt ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel3.setText("Date (yy:mm:dd)");

        textReceiptID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textReceiptIDActionPerformed(evt);
            }
        });

        textReceiptDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textReceiptDateActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel11.setText("Ammount (Rs.)");

        textReceiptAmmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textReceiptAmmountActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel12.setText("Type");

        textReceiptType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textReceiptTypeActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel13.setText("Description");

        textReceiptDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textReceiptDescriptionActionPerformed(evt);
            }
        });

        ReceiptUpdateButton.setFont(new java.awt.Font("Times New Roman", 1, 14));
        ReceiptUpdateButton.setText("Update ");
        ReceiptUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(ReceiptSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReceiptUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textReceiptDescription, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textReceiptType, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textReceiptAmmount, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textReceiptDate, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textReceiptID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textReceiptID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textReceiptDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textReceiptAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textReceiptType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textReceiptDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReceiptSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReceiptUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        ReceiptTab.addTab("Receipts", jPanel1);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Employee's ID");

        textEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmployeeIDActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("First Name");

        textFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFirstNameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Last Name");

        textLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLastNameActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Job Title");

        textJobTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textJobTitleActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("Salary (Rs.)");

        textSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSalaryActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Branch");

        textOtherDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textOtherDetailsActionPerformed(evt);
            }
        });

        EmployeeSearchButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EmployeeSearchButton.setText("Search");
        EmployeeSearchButton.setToolTipText("Just enter the Employee's ID and press this button");
        EmployeeSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeSearchButtonActionPerformed(evt);
            }
        });

        UpdateEmployeeButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UpdateEmployeeButton.setText("Update ");
        UpdateEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEmployeeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(EmployeeSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addComponent(UpdateEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(textFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addComponent(textLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addComponent(jLabel21)
                    .addComponent(textJobTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addComponent(jLabel22)
                    .addComponent(textSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addComponent(jLabel23)
                    .addComponent(textOtherDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textOtherDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        ReceiptTab.addTab("Employees", jPanel3);

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ReceiptTab, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addComponent(LogoutButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LogoutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReceiptTab, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
        );

        ReceiptTab.getAccessibleContext().setAccessibleName("Receipts");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReceiptSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptSearchButtonActionPerformed
       //get the ID of the receipt and pass it to the AccountantHandler
        String stringID = textReceiptID.getText();
        int ID = Integer.parseInt(stringID);
        newHandler.getReceipt(ID);
       
        if(newHandler.getReceiptErrorMsg() != null){
            JOptionPane.showMessageDialog(rootPane, newHandler.getReceiptErrorMsg());
        }
        //get the details from AccountantHandler and display them on the AccountantWindow
        textReceiptID.setText(Integer.toString(newHandler.getReceiptID()));
        textReceiptDate.setText(newHandler.getReceiptDate());
        textReceiptAmmount.setText(Double.toString(newHandler.getReceiptAmmount()));
        textReceiptType.setText(newHandler.getReceiptType());
        textReceiptDescription.setText(newHandler.getReceiptDescription());            
   }//GEN-LAST:event_ReceiptSearchButtonActionPerformed

    private void textReceiptIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textReceiptIDActionPerformed
       // R_Name = ReceiptName.getText();
    }//GEN-LAST:event_textReceiptIDActionPerformed

    private void textReceiptDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textReceiptDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textReceiptDateActionPerformed

    private void textReceiptAmmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textReceiptAmmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textReceiptAmmountActionPerformed

    private void textReceiptTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textReceiptTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textReceiptTypeActionPerformed

    private void textReceiptDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textReceiptDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textReceiptDescriptionActionPerformed

    private void ReceiptUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptUpdateButtonActionPerformed
       // get details of the receipt from the AccountantWindow
        String date = textReceiptDate.getText( );
        String type = textReceiptType.getText( );
        String textID = textReceiptID.getText( );
        String textAmmount = textReceiptAmmount.getText();
        String description = textReceiptDescription.getText();
        int ID = Integer.parseInt(textID);
        double ammount = Double.parseDouble(textAmmount);
        //pass the data to AccountHandler to update the Receipt
        newHandler.setReceiptID(ID);
        newHandler.setReceiptDate(date);
        newHandler.setReceiptAmmount(ammount);
        newHandler.setReceiptType(type);
        newHandler.setReceiptDescription(description);
        //update the database via the AccountHandler
        newHandler.setReceipt();
        
        JOptionPane.showMessageDialog(rootPane, "Updated successfully");            
    }//GEN-LAST:event_ReceiptUpdateButtonActionPerformed

    private void textPaymentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPaymentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPaymentIDActionPerformed

    private void textPaymentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPaymentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPaymentDateActionPerformed

    private void textPaymentAmmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPaymentAmmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPaymentAmmountActionPerformed

    private void textPaymentTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPaymentTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPaymentTypeActionPerformed

    private void textPaymentDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPaymentDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPaymentDescriptionActionPerformed

    private void PaymentSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentSearchButtonActionPerformed
        //get the ID of the payement and pass it to the AccountantHandler
        String stringID = textPaymentID.getText();
        int ID = Integer.parseInt(stringID);
        newHandler.getPayment(ID);
       
        if(newHandler.getPaymentErrorMsg() != null){
            JOptionPane.showMessageDialog(rootPane, newHandler.getPaymentErrorMsg());
        }
        //display the delais of the payment on the AccountantWindow
        textPaymentID.setText(Integer.toString(newHandler.getPaymentID()));
        textPaymentDate.setText(newHandler.getPaymentDate());
        textPaymentAmmount.setText(Double.toString(newHandler.getPaymentAmmount()));
        textPaymentType.setText(newHandler.getPaymentType());
        textPaymentDescription.setText(newHandler.getPaymentDescription());        
    }//GEN-LAST:event_PaymentSearchButtonActionPerformed

    private void PaymentUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentUpdateButtonActionPerformed
       //get the data on the AccountantWindow
        String date = textPaymentDate.getText( );
        String type = textPaymentType.getText( );
        String textID = textPaymentID.getText( );
        String textAmmount = textPaymentAmmount.getText();
        String description = textPaymentDescription.getText();
        int ID = Integer.parseInt(textID);
        double ammount = Double.parseDouble(textAmmount);

        //pass the data to the AccountantHandler to update the payment
        newHandler.setPaymentID(ID);
        newHandler.setPaymentDate(date);
        newHandler.setPaymentAmmount(ammount);
        newHandler.setPaymentType(type);
        newHandler.setPaymentDescription(description);
        //update the database via the AccountantHandler
        newHandler.setPayment();
        
        JOptionPane.showMessageDialog(rootPane, "Updated successfully");        
    }//GEN-LAST:event_PaymentUpdateButtonActionPerformed

    private void textEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmployeeIDActionPerformed

    private void textFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFirstNameActionPerformed

    private void textLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLastNameActionPerformed

    private void textJobTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textJobTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textJobTitleActionPerformed

    private void textSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSalaryActionPerformed

    private void textOtherDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textOtherDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textOtherDetailsActionPerformed

    private void EmployeeSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeSearchButtonActionPerformed
       //get the ID value of the Employee and pass it to the AccoutantHandler
        String stringID = textEmployeeID.getText();
        int ID = Integer.parseInt(stringID);
        newHandler.getEmployee(ID);
       
        if(newHandler.getErrorMsg() != null){
            JOptionPane.showMessageDialog(rootPane, newHandler.getErrorMsg());
        }
        //display the details of the Employee on the AccountantWindow
        textEmployeeID.setText(Integer.toString(newHandler.getEmployeeID()));
        textFirstName.setText(newHandler.getEmployeeFirstName());
        textLastName.setText(newHandler.getEmployeeLastName());
        textJobTitle.setText(newHandler.getJobTitle());
        textSalary.setText(Double.toString(newHandler.getSalary()));
        textOtherDetails.setText(newHandler.getOtherDetails());

    }//GEN-LAST:event_EmployeeSearchButtonActionPerformed

    private void UpdateEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEmployeeButtonActionPerformed
        //get the details of the Employee
        String first = textFirstName.getText( );
        String last = textLastName.getText( );
        String job = textJobTitle.getText( );
        String textID = textEmployeeID.getText( );
        String salary = textSalary.getText();
        String details = textOtherDetails.getText();
        int ID = Integer.parseInt(textID);
        double sal = Double.parseDouble(salary);
        //pass the details to the AccountantHandler to update the Employee
        newHandler.setEmployeeID(ID);
        newHandler.setFirstName(first);
        newHandler.setLastName(last);
        newHandler.setJobTitle(job);
        newHandler.setSalary(sal);
        newHandler.setOtherDetails(details);
        //update the database via the AccountantHandler
        newHandler.setEmployee();
        
        JOptionPane.showMessageDialog(rootPane, "Updated successfully");
    }//GEN-LAST:event_UpdateEmployeeButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        this.dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AccountantWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountantWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountantWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountantWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AccountantWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmployeeSearchButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton PaymentSearchButton;
    private javax.swing.JButton PaymentUpdateButton;
    private javax.swing.JButton ReceiptSearchButton;
    private javax.swing.JTabbedPane ReceiptTab;
    private javax.swing.JButton ReceiptUpdateButton;
    private javax.swing.JButton UpdateEmployeeButton;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField textEmployeeID;
    private javax.swing.JTextField textFirstName;
    private javax.swing.JTextField textJobTitle;
    private javax.swing.JTextField textLastName;
    private javax.swing.JTextField textOtherDetails;
    private javax.swing.JTextField textPaymentAmmount;
    private javax.swing.JTextField textPaymentDate;
    private javax.swing.JTextField textPaymentDescription;
    private javax.swing.JTextField textPaymentID;
    private javax.swing.JTextField textPaymentType;
    private javax.swing.JTextField textReceiptAmmount;
    private javax.swing.JTextField textReceiptDate;
    private javax.swing.JTextField textReceiptDescription;
    private javax.swing.JTextField textReceiptID;
    private javax.swing.JTextField textReceiptType;
    private javax.swing.JTextField textSalary;
    // End of variables declaration//GEN-END:variables
}
