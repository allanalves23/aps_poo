package gui;

import classes.Jogo;
import classes.Pangramas;
import classes.ResultadoRodada;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author allan wanderley alves
 * aps programação orientada a objeto - 2018.1
 * ultima modificação 03/06/2018
 */
public class AplicationPrincipal extends javax.swing.JFrame {

    private Color padrao;//Cor de fundo padrao para as teclas não pressionadas
    private Color cinza = Color.GRAY; //Cor de fundo das teclas pressionadas
    private JButton btnLast; //ponteiro para ultima tecla pressionada
    private boolean capsFlag; //flag para tratar o CAPSLOCK de maneira distinta das outras teclas
    private Pangramas pangramas;// Objeto que carrega os pangramas no sistema
    private Jogo game;//Objeto que retém as configurações do jogo
    private int flagTeclas;//flag para detectar o backspace ao ser pressionado
    private boolean flagAjuda;//flag para detectar se o modo Ajuda esta desativado ou ativado
    private String version =  "1.2.55";//Variavel para associar a versão do programa dentro do botão 'Sobre'
    private static AplicationPangramas telaViewPangramas;
    private static AplicationSobre telaViewSobre;
    private ResultadoRodada resultados;
    
    public AplicationPrincipal() {
        
       
        initComponents();
        btnLast = null;//O ultimo botão que foi pressionado é NULL
        capsFlag = false;//O Capslock vem desabilitado por padrão
        pangramas = new Pangramas();//carregamento dos pangramas
        flagTeclas = 0;//backspace nao esta pressionado por padrao
        flagAjuda = false;//modo ajuda desabilitado
        telaViewPangramas=null;
        resultados=new ResultadoRodada();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        aspasBtn = new javax.swing.JButton();
        tBtn = new javax.swing.JButton();
        pontoBtn = new javax.swing.JButton();
        quatroBtn = new javax.swing.JButton();
        seteBtn = new javax.swing.JButton();
        eBtn = new javax.swing.JButton();
        downBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        uBtn = new javax.swing.JButton();
        aBtn = new javax.swing.JButton();
        rBtn = new javax.swing.JButton();
        oBtn = new javax.swing.JButton();
        maisBtn = new javax.swing.JButton();
        hBtn = new javax.swing.JButton();
        upBtn = new javax.swing.JButton();
        doisBtn = new javax.swing.JButton();
        pontVirgBtn = new javax.swing.JButton();
        tabBtn = new javax.swing.JButton();
        seisBtn = new javax.swing.JButton();
        concRightBtn = new javax.swing.JButton();
        barraBtn = new javax.swing.JButton();
        bBtn = new javax.swing.JButton();
        iBtn = new javax.swing.JButton();
        fBtn = new javax.swing.JButton();
        enterBtn = new javax.swing.JButton();
        noveBtn = new javax.swing.JButton();
        gBtn = new javax.swing.JButton();
        zBtn = new javax.swing.JButton();
        cBtn = new javax.swing.JButton();
        cdilhaBtn = new javax.swing.JButton();
        qBtn = new javax.swing.JButton();
        umBtn = new javax.swing.JButton();
        nBtn = new javax.swing.JButton();
        shiftBtn = new javax.swing.JButton();
        wBtn = new javax.swing.JButton();
        oitoBtn = new javax.swing.JButton();
        menosBtn = new javax.swing.JButton();
        lbtn = new javax.swing.JButton();
        capsBtn = new javax.swing.JButton();
        sBtn = new javax.swing.JButton();
        rightBtn = new javax.swing.JButton();
        leftBtn = new javax.swing.JButton();
        virgBtn = new javax.swing.JButton();
        kbtn = new javax.swing.JButton();
        pBtn = new javax.swing.JButton();
        backspcBtn = new javax.swing.JButton();
        xBtn = new javax.swing.JButton();
        jBtn = new javax.swing.JButton();
        spaceBtn = new javax.swing.JButton();
        padrao = spaceBtn.getBackground();
        concLeftBtn = new javax.swing.JButton();
        vBtn = new javax.swing.JButton();
        mBtn = new javax.swing.JButton();
        yBtn = new javax.swing.JButton();
        dBtn = new javax.swing.JButton();
        tresBtn = new javax.swing.JButton();
        cincoBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        pangramaLabel = new javax.swing.JLabel();
        newGameBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        acertosMsg = new javax.swing.JLabel();
        acertoValor = new javax.swing.JLabel();
        errosMsg = new javax.swing.JLabel();
        erroValor = new javax.swing.JLabel();
        percentMsg = new javax.swing.JLabel();
        simboloPercent = new javax.swing.JLabel();
        percentValor = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnUltimosResultados = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblHelp = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuOpcoes = new javax.swing.JMenu();
        menuNovoJogo = new javax.swing.JMenuItem();
        menuConfigPangrama = new javax.swing.JMenu();
        itemMenuLingPangrama = new javax.swing.JMenu();
        pangramaIngles = new javax.swing.JMenuItem();
        pangramaPortugues = new javax.swing.JMenuItem();
        itemMenuGerarPang = new javax.swing.JMenuItem();
        selecionarPangrama = new javax.swing.JMenuItem();
        visualizarPangramas = new javax.swing.JMenuItem();
        itemMenuPause = new javax.swing.JMenuItem();
        menuItemSair = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemMenuAjuda = new javax.swing.JMenuItem();
        itemMenuSobre = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu2.setText("jMenu2");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("aps_poo");
        setResizable(false);

        aspasBtn.setText("'");
        aspasBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        aspasBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        tBtn.setText("T");
        tBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        tBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        pontoBtn.setText(".");
        pontoBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        pontoBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        quatroBtn.setText("4");
        quatroBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        quatroBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        seteBtn.setText("7");
        seteBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        seteBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        eBtn.setText("E");
        eBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        eBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        downBtn.setText("↓");
        downBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        downBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        zeroBtn.setText("0");
        zeroBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        zeroBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        uBtn.setText("U");
        uBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        uBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        aBtn.setText("A");
        aBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        aBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        rBtn.setText("R");
        rBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        rBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        oBtn.setText("O");
        oBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        oBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        maisBtn.setText("+");
        maisBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        maisBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        hBtn.setText("H");
        hBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        hBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        upBtn.setText("↑");
        upBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        upBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        doisBtn.setText("2");
        doisBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        doisBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        pontVirgBtn.setText(";");
        pontVirgBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        pontVirgBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        tabBtn.setText("TAB");
        tabBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        tabBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        seisBtn.setText("6");
        seisBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        seisBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        concRightBtn.setText("]");
        concRightBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        concRightBtn.setMinimumSize(new java.awt.Dimension(48, 48));

        barraBtn.setText("\\");
            barraBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            barraBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            bBtn.setText("B");
            bBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            bBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            iBtn.setText("I");
            iBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            iBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            fBtn.setText("F");
            fBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            fBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            enterBtn.setText("ENTER");
            enterBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            enterBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            noveBtn.setText("9");
            noveBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            noveBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            gBtn.setText("G");
            gBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            gBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            zBtn.setText("Z");
            zBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            zBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            cBtn.setText("C");
            cBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            cBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            cdilhaBtn.setText("Ç");
            cdilhaBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            cdilhaBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            qBtn.setText("Q");
            qBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            qBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            umBtn.setText("1");
            umBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            umBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            nBtn.setText("N");
            nBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            nBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            shiftBtn.setText("SHIFT");
            shiftBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            shiftBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            wBtn.setText("W");
            wBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            wBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            oitoBtn.setText("8");
            oitoBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            oitoBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            menosBtn.setText("-");
            menosBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            menosBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            lbtn.setText("L");
            lbtn.setMaximumSize(new java.awt.Dimension(48, 48));
            lbtn.setMinimumSize(new java.awt.Dimension(48, 48));

            capsBtn.setText("CAPSLOCK");
            capsBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            capsBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            sBtn.setText("S");
            sBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            sBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            rightBtn.setText("→");
            rightBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            rightBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            leftBtn.setText("←");
            leftBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            leftBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            virgBtn.setText(",");
            virgBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            virgBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            kbtn.setText("K");
            kbtn.setMaximumSize(new java.awt.Dimension(48, 48));
            kbtn.setMinimumSize(new java.awt.Dimension(48, 48));

            pBtn.setText("P");
            pBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            pBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            backspcBtn.setText("Backspace");

            xBtn.setText("X");
            xBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            xBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            jBtn.setText("J");
            jBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            jBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            spaceBtn.setText("SPACE");
            spaceBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            spaceBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            concLeftBtn.setText("[");
            concLeftBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            concLeftBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            vBtn.setText("V");
            vBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            vBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            mBtn.setText("M");
            mBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            mBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            yBtn.setText("Y");
            yBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            yBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            dBtn.setText("D");
            dBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            dBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            tresBtn.setText("3");
            tresBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            tresBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            cincoBtn.setText("5");
            cincoBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            cincoBtn.setMinimumSize(new java.awt.Dimension(48, 48));

            textArea.setColumns(20);
            textArea.setRows(5);
            textArea.setEnabled(false);
            textArea.addCaretListener(new javax.swing.event.CaretListener() {
                public void caretUpdate(javax.swing.event.CaretEvent evt) {
                    textAreaCaretUpdate(evt);
                }
            });
            textArea.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    textAreaKeyPressed(evt);
                }
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    textAreaKeyReleased(evt);
                }
            });
            jScrollPane1.setViewportView(textArea);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(shiftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(barraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(zBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(xBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(vBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(bBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(nBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(mBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(virgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(pontoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(190, 190, 190)
                                    .addComponent(spaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(pontVirgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(downBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2)
                            .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(aspasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(umBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(doisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(tresBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(quatroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(cincoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(seisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(seteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(oitoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(noveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(zeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(menosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(maisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(backspcBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tabBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(qBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(wBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(eBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(rBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(tBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(yBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(uBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(iBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(oBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(pBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(concLeftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(capsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(aBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(sBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(dBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(fBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(gBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(hBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(kbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(lbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(cdilhaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(concRightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(25, 25, 25))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aspasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(umBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tresBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quatroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cincoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oitoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(backspcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(concLeftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(iBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tabBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(capsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cdilhaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(concRightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(shiftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(barraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(zBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(xBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(vBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(virgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pontoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pontVirgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(downBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25))
            );

            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "COMPLETE O PANGRAMA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 12))); // NOI18N

            pangramaLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            pangramaLabel.setText(" ");

            newGameBtn.setBackground(new java.awt.Color(0, 153, 255));
            newGameBtn.setForeground(new java.awt.Color(255, 255, 255));
            newGameBtn.setText("Novo Jogo!");
            newGameBtn.setVisible(false);
            newGameBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    newGameBtnActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(339, 339, 339))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pangramaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(pangramaLabel)
                    .addGap(18, 18, 18)
                    .addComponent(newGameBtn)
                    .addContainerGap(57, Short.MAX_VALUE))
            );

            jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Acesse o menu ajuda para orientações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 11))); // NOI18N
            jPanel3.setToolTipText("");

            jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            acertosMsg.setForeground(new java.awt.Color(0, 153, 204));
            acertosMsg.setText("Acertos");

            acertoValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            acertoValor.setText("0");

            errosMsg.setForeground(new java.awt.Color(255, 0, 0));
            errosMsg.setText("Erros");

            erroValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            erroValor.setText("0");

            percentMsg.setForeground(new java.awt.Color(0, 102, 0));
            percentMsg.setText("Porcentagem");

            simboloPercent.setText("%");

            percentValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            percentValor.setText("0");

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(erroValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errosMsg, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGap(50, 50, 50)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(acertosMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acertoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(48, 48, 48)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(percentMsg)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(simboloPercent)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(percentValor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(percentMsg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(errosMsg)
                                .addComponent(acertosMsg))
                            .addGap(2, 2, 2)))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(percentValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(erroValor)
                            .addComponent(acertoValor)
                            .addComponent(simboloPercent)))
                    .addContainerGap(22, Short.MAX_VALUE))
            );

            jTabbedPane1.addTab("Resultado atual", jPanel4);

            jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            btnUltimosResultados.setText("Visualizar");
            btnUltimosResultados.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnUltimosResultadosActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(btnUltimosResultados)
                    .addContainerGap(89, Short.MAX_VALUE))
            );
            jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(btnUltimosResultados)
                    .addContainerGap(25, Short.MAX_VALUE))
            );

            jTabbedPane1.addTab("Ultimos resultados", jPanel5);

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            lblHelp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            lblHelp.setForeground(new java.awt.Color(255, 0, 0));
            lblHelp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            menuOpcoes.setText("Opções");

            menuNovoJogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
            menuNovoJogo.setText("Novo Jogo");
            menuNovoJogo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuNovoJogoActionPerformed(evt);
                }
            });
            menuOpcoes.add(menuNovoJogo);

            menuConfigPangrama.setText("Configurações Pangramas");

            itemMenuLingPangrama.setText("Linguagem Pangrama");
            itemMenuLingPangrama.setEnabled(false);

            pangramaIngles.setText("Inglês");
            pangramaIngles.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    pangramaInglesActionPerformed(evt);
                }
            });
            itemMenuLingPangrama.add(pangramaIngles);

            pangramaPortugues.setText("Português");
            pangramaPortugues.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    pangramaPortuguesActionPerformed(evt);
                }
            });
            itemMenuLingPangrama.add(pangramaPortugues);

            menuConfigPangrama.add(itemMenuLingPangrama);

            itemMenuGerarPang.setText("Gerar pangrama aleatorio");
            itemMenuGerarPang.setEnabled(false);
            itemMenuGerarPang.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemMenuGerarPangActionPerformed(evt);
                }
            });
            menuConfigPangrama.add(itemMenuGerarPang);

            selecionarPangrama.setText("Selecionar Pangrama");
            selecionarPangrama.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    selecionarPangramaActionPerformed(evt);
                }
            });
            menuConfigPangrama.add(selecionarPangrama);

            menuOpcoes.add(menuConfigPangrama);

            visualizarPangramas.setText("Visualizar Todos os pangramas");
            visualizarPangramas.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    visualizarPangramasActionPerformed(evt);
                }
            });
            menuOpcoes.add(visualizarPangramas);

            itemMenuPause.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
            itemMenuPause.setText("Pausar Jogo");
            itemMenuPause.setEnabled(false);
            itemMenuPause.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemMenuPauseActionPerformed(evt);
                }
            });
            menuOpcoes.add(itemMenuPause);

            menuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
            menuItemSair.setText("Sair");
            menuItemSair.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuItemSairActionPerformed(evt);
                }
            });
            menuOpcoes.add(menuItemSair);

            barraMenu.add(menuOpcoes);

            menuAjuda.setText("Ajuda");

            itemMenuAjuda.setText("Ajuda");
            itemMenuAjuda.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemMenuAjudaActionPerformed(evt);
                }
            });
            menuAjuda.add(itemMenuAjuda);

            itemMenuSobre.setText("Sobre");
            itemMenuSobre.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemMenuSobreActionPerformed(evt);
                }
            });
            menuAjuda.add(itemMenuSobre);

            barraMenu.add(menuAjuda);

            setJMenuBar(barraMenu);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(314, 314, 314))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void textAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyPressed
        switch (evt.getKeyCode()) {//verifica se a tecla pressionada é o BACKSPACE
            case KeyEvent.VK_BACKSPACE:
                flagTeclas = 1;//ativa a flag caso positivo
                break;
            case KeyEvent.VK_CAPS_LOCK:
                if(capsFlag){
                    capsBtn.setBackground(padrao);
                    capsFlag = false;
                }else{
                    capsBtn.setBackground(cinza);
                    capsFlag = true;
                }
                break;
            default:
                flagTeclas = 0;//desativa a flag caso negativo
                break;
        }
        trocaFundo(verificaTeclaInput(evt.getKeyChar(), evt.getKeyCode()),0);//Troca o fundo das teclas
       
    }//GEN-LAST:event_textAreaKeyPressed

    private void textAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER&&flagAjuda){//Metodo que sai do modo ajuda para um novo jogo
            //após o mesmo ter sido habilitado
            textArea.setEditable(true);
            lblHelp.setText("");
            menuConfigPangrama.setEnabled(true);
            menuNovoJogo.setEnabled(true);
            menuAjuda.setEnabled(true);
            flagAjuda=false;
            newGameBtn.setEnabled(true);
            if(newGameBtn.isVisible()){
                newGameBtn.setVisible(false);
            }
            if(!itemMenuPause.isEnabled()){
                itemMenuPause.setEnabled(true);
            }
            newGameStatsRandom();
        }
        
         trocaFundo(verificaTeclaInput(evt.getKeyChar(), evt.getKeyCode()),1);//Troca o fundo das teclas
    }//GEN-LAST:event_textAreaKeyReleased

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        //metodo que trata a finalização do programa
        if (JOptionPane.showConfirmDialog(this , "Todo o seu progresso será perdido", "Tem certeza?", DISPOSE_ON_CLOSE,JOptionPane.WARNING_MESSAGE)==0) {
             System.exit(0);
        }
    }//GEN-LAST:event_menuItemSairActionPerformed
    
    private void questionRestartGame(){
        if(textArea.getText().length()>0 || !acertoValor.getText().equals("0") || !erroValor.getText().equals("0")){
            if(JOptionPane.showConfirmDialog(this, "Carregar um novo pangrama reiniciará o jogo", "Tem certeza?", JOptionPane.YES_NO_OPTION)==0){
               cleanScreen();
               newGameStatsRandom();//carrega um pangrama da mesma tipagem selecionada
            }        
        }else{
            cleanScreen();
            carregarPangrama();
        }
    }
    private void pangramaInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pangramaInglesActionPerformed
        //metodo para alterar para pangramas em ingles
        if(pangramas.alterarTipoPangrama(1)==-1){/*'alterarTipoPangrama(1)' metodo para alterar a linguagem do pangrama
            parametro 1 define que a linguagem escolhida é o ingles.*/
            JOptionPane.showMessageDialog(this, "Tipo de linguagem já selecionado","Impossível alterar",JOptionPane.OK_OPTION);/*caso o tipo de pangrama ja esteja definido como portugues
            um aviso é emitido*/
        }else{
            questionRestartGame();
        }
    }//GEN-LAST:event_pangramaInglesActionPerformed

    private void pangramaPortuguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pangramaPortuguesActionPerformed
        //metodo para alterar para pangramas em portugues
        if(pangramas.alterarTipoPangrama(0)==-1){/*'alterarTipoPangrama(0)' metodo para alterar a linguagem do pangrama
            parametro 0 define que a linguagem escolhida é o portugues.*/
            JOptionPane.showMessageDialog(this, "Tipo de linguagem já selecionado","Impossível alterar",JOptionPane.OK_OPTION);/*caso o tipo de pangrama ja esteja definido como portugues
            um aviso é emitido*/
        }else{
            questionRestartGame();
        }
    }//GEN-LAST:event_pangramaPortuguesActionPerformed
    private void itemMenuGerarPangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuGerarPangActionPerformed
        questionRestartGame();
    }//GEN-LAST:event_itemMenuGerarPangActionPerformed

    private void menuNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovoJogoActionPerformed
        if(textArea.isEnabled()||lblHelp.getText().length()>0){
            lblHelp.setText("");
        }
        if(newGameBtn.isVisible()){
            newGameBtn.setVisible(false);
        }
        if(AplicationPangramas.resetGame==1){
            newGameStatsPrefedefined();
            AplicationPangramas.resetGame=0;
        }else{
            newGameStatsRandom();//chama o metodo para carregar um novo jogo de maneira aleatoria
        }
        itemMenuPause.setEnabled(true);
        
    }//GEN-LAST:event_menuNovoJogoActionPerformed
   
    private void newGameStatsRandom(){//carrega um novo jogo sobrescrevendo o antigo(caso possuir)
        game = new Jogo();
        pangramaLabel.setText(pangramas.carregarPangrama());
        game.inicioJogo(pangramaLabel.getText());
        textArea.setEnabled(true);
        textArea.requestFocus();
        textArea.setText(textArea.getText().replace(textArea.getText(), ""));
        cleanScreen();
        changeStateItensMenu(true);
        carregarPangrama();
        if(!menuConfigPangrama.isEnabled()){
            menuConfigPangrama.setEnabled(true);
        }
        
    }
    
    public void newGameStatsPrefedefined(){
        
        System.out.println(AplicationPangramas.pangramaSelecionado);
        pangramaLabel.setText(AplicationPangramas.pangramaSelecionado);
        game = new Jogo();
        game.inicioJogo(pangramaLabel.getText());
        textArea.setEnabled(true);
        textArea.requestFocus();
        textArea.setText(textArea.getText().replace(textArea.getText(), ""));
        cleanScreen();
        changeStateItensMenu(true);
        
    }
    
    private void changeStateItensMenu(boolean state){
        if(state){
            itemMenuGerarPang.setEnabled(true);
            itemMenuLingPangrama.setEnabled(true);
        }else{
            itemMenuGerarPang.setEnabled(false);
            itemMenuLingPangrama.setEnabled(false);
        }
    }
    
    private void cleanScreen(){
        percentValor.setText("0");
        erroValor.setText("0");
        acertoValor.setText("0");
    }
    private void textAreaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textAreaCaretUpdate
        if(textArea.getText().length()==0){
            return;
        }else{
            if(textArea.isEditable()){
                newGameBtn.setVisible(true);
            }
        }
        if(!flagAjuda && textArea.isEnabled()){//Metodo para verificar a cada atualização do ponteiro na area de texto
            //verifica se a flag de ajuda estiver desabilitada e se a area de texto estiver habilitada
            int tamanho;
            if(textArea.getText().length()!=0){
              tamanho = textArea.getText().length();//captura o comprimento da frase dentro da area de texto
  
            }else{
                tamanho = 0;
            }
            if(flagTeclas == 0){//verifica se o BACKSPACE foi pressionado
                if(game.contagem(pangramaLabel.getText(),textArea.getText().charAt(tamanho-1),textArea.getText())){//metodo para contar os acertos
                    acertoValor.setText(Integer.toString(game.getAcertos())); //setar incremento de acerto na label

                }else{
                    erroValor.setText(Integer.toString(game.getErros()));//setar incremento de erro na label
                    
                }
                percentValor.setText(String.format("%.2f",game.getPercent()));//seta a porcentagem de acerto
            }
            if(game.fimJogo()){//verifica se o jogo terminou com base no tamanho em caracteres da frase certa com o pangrama
                String user = "";
                do{
                     user = JOptionPane.showInputDialog(this,"Acertos: "+game.getAcertos()+"\nErros: "+game.getErros()+"\n"
                        + "Porcentagem de acerto: "+game.getPercent()+"\nInsira seu nome (Máximo 8 Letras)","Pangrama completo!", JOptionPane.INFORMATION_MESSAGE);
                }while(user.equals("")||user.length()>8);
                resultados.pressetValue(user.toUpperCase(),pangramaLabel.getText(), game.getAcertos(), game.getErros(), game.getPercent());
            textArea.setEnabled(false);
            itemMenuPause.setEnabled(false);
            menuConfigPangrama.setEnabled(false);
            }
        }
    }//GEN-LAST:event_textAreaCaretUpdate

    private void itemMenuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAjudaActionPerformed
        //Metodo para habilitar o modo ajuda
        flagAjuda=true;//flag modo ajuda é habilitado
        menuNovoJogo.setEnabled(false);//Menu de novo jogo desabilitado
        menuConfigPangrama.setEnabled(false);//Menu de configuração de pangramas desabilitado
        menuAjuda.setEnabled(false);//menu de ajuda desabilitado
        lblHelp.setText("MODO AJUDA");//Insere texto em uma LABEL ilustrando o modo ajuda
        cleanScreen();
        pangramaLabel.setText("");
        if(!textArea.isEnabled()){
            textArea.setEnabled(true);//habilita a area de texto
        }
        //seta o texto abaixo na area de texto
        textArea.setText("Este é um jogo treinamento de digitação.\n" +
"Se consiste em digitar corretamente todo pangrama com o objetivo\n" +
"de conseguir a maior porcentagem de aproveitamento de acertos possivel.\n" +
"São existentes pangramas em inglês e português.\n" +
"Por padrão os pangramas na linguagem português vem habilitados.\n" +
"Acesse o menu 'Configurações Pangramas', 'Linguagem Pangrama' e selecione\n" +
"o idioma de preferencia.\n" +
"É possível gerar um outro pangrama randomicamente acessando a opção\n" +
"'Gerar outro pangrama' dentro de 'Configurações Pangramas'.\n" +
"Para resetar seu jogo Acesse a opção 'Novo jogo' ou pressione as teclas CTRL + N.\n" +
"\n" +
"Pressione Enter para sair do modo Ajuda.");
        textArea.setEditable(false);//Bloqueia edição na area de texto
        textArea.grabFocus();//captura o foco para a area de texto
        newGameBtn.setVisible(false);
        newGameBtn.setEnabled(false);
        itemMenuPause.setEnabled(false);
    }//GEN-LAST:event_itemMenuAjudaActionPerformed

    private void newGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameBtnActionPerformed
        if(textArea.isEnabled()||lblHelp.getText().length()>0){
            lblHelp.setText("");
        }
        if(newGameBtn.isVisible()){
            newGameBtn.setVisible(false);
        }
        if(AplicationPangramas.resetGame==1){
            newGameStatsPrefedefined();
            AplicationPangramas.resetGame=0;
        }else{
            newGameStatsRandom();//chama o metodo para carregar um novo jogo de maneira aleatoria
        }
        itemMenuPause.setEnabled(true);
    }//GEN-LAST:event_newGameBtnActionPerformed

    private void itemMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSobreActionPerformed
        if(telaViewSobre==null){
            telaViewSobre=new AplicationSobre(this,true,version);
        }
        telaViewSobre.setVisible(true);
        telaViewSobre.setAlwaysOnTop(true);
        
    }//GEN-LAST:event_itemMenuSobreActionPerformed

    private void visualizarPangramasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarPangramasActionPerformed
        if(telaViewPangramas==null){
            telaViewPangramas=new AplicationPangramas(this,true);
            
        }
            telaViewPangramas.load(0);
            telaViewPangramas.setVisible(true);
            telaViewPangramas.setAlwaysOnTop(true);        
    }//GEN-LAST:event_visualizarPangramasActionPerformed

    private void selecionarPangramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarPangramaActionPerformed
        
        if(telaViewPangramas==null){
            telaViewPangramas=new AplicationPangramas(this,true);
        }
        telaViewPangramas.load(1);
        telaViewPangramas.setVisible(true);
        telaViewPangramas.setAlwaysOnTop(true);
         
    }//GEN-LAST:event_selecionarPangramaActionPerformed

    private void itemMenuPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuPauseActionPerformed
        if(textArea.isEnabled()){
            lblHelp.setText("Jogo Pausado");
            textArea.setEnabled(false);
        }else{
            lblHelp.setText("");
            textArea.setEnabled(true);
        }
    }//GEN-LAST:event_itemMenuPauseActionPerformed

    private void btnUltimosResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimosResultadosActionPerformed
        AplicationJogos app = new AplicationJogos(this, true, resultados);
        app.setVisible(true);
    }//GEN-LAST:event_btnUltimosResultadosActionPerformed
    
    private void carregarPangrama(){
        //metodo para carregar o pangrama ativo na memoria
        String pangrama;
        pangrama = pangramas.carregarPangrama();
        while(pangramaLabel.getText().equals(pangrama)){//Evita sobrescrição de um pangrama anterior pelo mesmo posterior
            pangrama = pangramas.carregarPangrama();
        }
        pangramaLabel.setText(pangrama);//seta o pangrama na label

    }
    private JButton verificaTeclaInput(char letra,int button){
        //metodo para verificar o botão pressionado
        switch (button){
            case KeyEvent.VK_QUOTE:
                return aspasBtn;
            case KeyEvent.VK_BACKSPACE:
                return backspcBtn;
            case KeyEvent.VK_TAB:
                return tabBtn;
            case KeyEvent.VK_ENTER:
                return enterBtn;
            case KeyEvent.VK_SHIFT:
                return shiftBtn;
            case KeyEvent.VK_BACK_SLASH:
                return barraBtn;
            case KeyEvent.VK_UP:
                return upBtn;
            case KeyEvent.VK_DOWN:
                return downBtn;
            case KeyEvent.VK_LEFT:
                return leftBtn;
            case KeyEvent.VK_RIGHT:
                return rightBtn;
            default:
                switch (letra){
                    case '0':
                        return zeroBtn;
                    case '1':
                        return umBtn;
                    case '2':
                        return doisBtn;
                    case '3':
                        return tresBtn;
                    case '4':
                        return quatroBtn;
                    case '5':
                        return cincoBtn;
                    case '6':
                        return seisBtn;
                    case '7':
                        return seteBtn;
                    case '8':
                        return oitoBtn;
                    case '9':
                        return noveBtn;
                    case '-':
                        return menosBtn;
                    case '+':
                        return maisBtn;
                    case 'q':
                        return qBtn;
                    case 'Q':
                        return qBtn;
                    case 'w':
                        return wBtn;
                    case 'W':
                        return wBtn;
                    case 'e':
                        return eBtn;
                    case 'E':
                        return eBtn;
                    case 'r':
                        return rBtn;
                    case 'R':
                        return rBtn;
                    case 't':
                        return tBtn;
                    case 'T':
                        return tBtn;
                    case 'y':
                        return yBtn;
                    case 'Y':
                        return yBtn;
                    case 'u':
                        return uBtn;
                    case 'U':
                        return uBtn;
                    case 'i':
                        return iBtn;
                    case 'I':
                        return iBtn;
                    case 'o':
                        return oBtn;
                    case 'O':
                        return oBtn;
                    case 'p':
                        return pBtn;
                    case 'P':
                        return pBtn;
                    case '[':
                        return concLeftBtn;
                    case 'a':
                        return aBtn;
                    case 'A':
                        return aBtn;
                    case 's':
                        return sBtn;
                    case 'S':
                        return sBtn;
                    case 'd':
                        return dBtn;
                    case 'D':
                        return dBtn;
                    case 'f':
                        return fBtn;
                    case 'F':
                        return fBtn;
                    case 'g':
                        return gBtn;
                    case 'G':
                        return gBtn;
                    case 'h':
                        return hBtn;
                    case 'H':
                        return hBtn;
                    case 'j':
                        return jBtn;
                    case 'J':
                        return jBtn;
                    case 'k':
                        return kbtn;
                    case 'K':
                        return kbtn;
                    case 'l':
                        return lbtn;
                    case 'L':
                        return lbtn;
                    case 'ç':
                        return cdilhaBtn;
                    case 'Ç':
                        return cdilhaBtn;
                    case ']':
                        return concRightBtn;
                    case 'z':
                        return zBtn;
                    case 'Z':
                        return zBtn;
                    case 'x':
                        return xBtn;
                    case 'X':
                        return xBtn;
                    case 'c':
                        return cBtn;
                    case 'C':
                        return cBtn;
                    case 'v':
                        return vBtn;
                    case 'V':
                        return vBtn;
                    case 'b':
                        return bBtn;
                    case 'B':
                        return bBtn;
                    case 'n':
                        return nBtn;
                    case 'N':
                        return nBtn;
                    case 'm':
                        return mBtn;
                    case 'M':
                        return mBtn;
                    case ',':
                        return virgBtn;
                    case '.':
                        return pontoBtn;
                    case ';':
                        return pontVirgBtn;
                    case ' ':
                        return spaceBtn;

                
                }                
        } 
        return null;
    }
    private void trocaFundo(JButton btn, int flag){
        //metodo para trocar a cor de fundo dos buttons - 0 para mudar para cinza
        //1 para retornar a cor padrao
        if(btn == null)
            return;

        if(btnLast == null ){//verifica se o btnLast é vazio
            btnLast = btn;//seta o botao atual para o btnlast
        }
        
        if(flag==0){
            btn.setBackground(cinza);
        }else{
            btn.setBackground(padrao);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicationPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AplicationPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aBtn;
    private javax.swing.JLabel acertoValor;
    private javax.swing.JLabel acertosMsg;
    private javax.swing.JButton aspasBtn;
    private javax.swing.JButton bBtn;
    private javax.swing.JButton backspcBtn;
    private javax.swing.JButton barraBtn;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnUltimosResultados;
    private javax.swing.JButton cBtn;
    private javax.swing.JButton capsBtn;
    private javax.swing.JButton cdilhaBtn;
    private javax.swing.JButton cincoBtn;
    private javax.swing.JButton concLeftBtn;
    private javax.swing.JButton concRightBtn;
    private javax.swing.JButton dBtn;
    private javax.swing.JButton doisBtn;
    private javax.swing.JButton downBtn;
    private javax.swing.JButton eBtn;
    private javax.swing.JButton enterBtn;
    private javax.swing.JLabel erroValor;
    private javax.swing.JLabel errosMsg;
    private javax.swing.JButton fBtn;
    private javax.swing.JButton gBtn;
    private javax.swing.JButton hBtn;
    private javax.swing.JButton iBtn;
    private javax.swing.JMenuItem itemMenuAjuda;
    private javax.swing.JMenuItem itemMenuGerarPang;
    private javax.swing.JMenu itemMenuLingPangrama;
    private javax.swing.JMenuItem itemMenuPause;
    private javax.swing.JMenuItem itemMenuSobre;
    private javax.swing.JButton jBtn;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton kbtn;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JButton lbtn;
    private javax.swing.JButton leftBtn;
    private javax.swing.JButton mBtn;
    private javax.swing.JButton maisBtn;
    private javax.swing.JButton menosBtn;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuConfigPangrama;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuNovoJogo;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JButton nBtn;
    private javax.swing.JButton newGameBtn;
    private javax.swing.JButton noveBtn;
    private javax.swing.JButton oBtn;
    private javax.swing.JButton oitoBtn;
    private javax.swing.JButton pBtn;
    private javax.swing.JMenuItem pangramaIngles;
    private javax.swing.JLabel pangramaLabel;
    private javax.swing.JMenuItem pangramaPortugues;
    private javax.swing.JLabel percentMsg;
    private javax.swing.JLabel percentValor;
    private javax.swing.JButton pontVirgBtn;
    private javax.swing.JButton pontoBtn;
    private javax.swing.JButton qBtn;
    private javax.swing.JButton quatroBtn;
    private javax.swing.JButton rBtn;
    private javax.swing.JButton rightBtn;
    private javax.swing.JButton sBtn;
    private javax.swing.JButton seisBtn;
    private javax.swing.JMenuItem selecionarPangrama;
    private javax.swing.JButton seteBtn;
    private javax.swing.JButton shiftBtn;
    private javax.swing.JLabel simboloPercent;
    private javax.swing.JButton spaceBtn;
    private javax.swing.JButton tBtn;
    private javax.swing.JButton tabBtn;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton tresBtn;
    private javax.swing.JButton uBtn;
    private javax.swing.JButton umBtn;
    private javax.swing.JButton upBtn;
    private javax.swing.JButton vBtn;
    private javax.swing.JButton virgBtn;
    private javax.swing.JMenuItem visualizarPangramas;
    private javax.swing.JButton wBtn;
    private javax.swing.JButton xBtn;
    private javax.swing.JButton yBtn;
    private javax.swing.JButton zBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
