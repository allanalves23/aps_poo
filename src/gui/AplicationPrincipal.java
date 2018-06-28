package gui;

import classes.*;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

/**
 *
 * @author allan wanderley alves
 * aps programação orientada a objeto - 2018.1
 * ultima modificação 03/06/2018
 */
public class AplicationPrincipal extends javax.swing.JFrame {

    private Color padrao;//Cor de fundo padrao para as teclas não pressionadas
    private Color cor = Color.GRAY; //Cor de fundo das teclas pressionadas
    private JButton btnLast; //ponteiro para ultima tecla pressionada
    private boolean capsFlag; //flag para tratar o CAPSLOCK de maneira distinta das outras teclas
    private Pangramas pangramas;// Objeto que carrega os pangramas no sistema
    private Jogo game;//Objeto que retém as configurações do jogo
    private int flagTeclas;//flag para detectar o backspace ao ser pressionado
    private boolean flagAjuda;//flag para detectar se o modo Ajuda esta desativado ou ativado
    private String version =  "1.3.0";//Variavel para associar a versão do programa dentro do botão 'Sobre'
    private ResultadoRodada resultados;
    private int cont = 0;
    private Timer timer = new Timer();
    public AplicationPrincipal() {
        
       
        initComponents();
        setIcon();
        btnLast = null;//O ultimo botão que foi pressionado é NULL
        capsFlag = false;//O Capslock vem desabilitado por padrão
        pangramas = new Pangramas();//carregamento dos pangramas
        flagTeclas = 0;//backspace nao esta pressionado por padrao
        flagAjuda = false;//modo ajuda desabilitado
        resultados=new ResultadoRodada();
        try {
            carregarUser();
        } catch (IOException ex) {
            Player.nome="USER";
        }
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
        oitoBtn = new javax.swing.JButton();
        menosBtn = new javax.swing.JButton();
        lbtn = new javax.swing.JButton();
        capsBtn = new javax.swing.JButton();
        sBtn = new javax.swing.JButton();
        rightBtn = new javax.swing.JButton();
        leftBtn = new javax.swing.JButton();
        virgBtn = new javax.swing.JButton();
        kbtn = new javax.swing.JButton();
        aspasBtn = new javax.swing.JButton();
        pBtn = new javax.swing.JButton();
        tBtn = new javax.swing.JButton();
        pontoBtn = new javax.swing.JButton();
        quatroBtn = new javax.swing.JButton();
        seteBtn = new javax.swing.JButton();
        backspcBtn = new javax.swing.JButton();
        xBtn = new javax.swing.JButton();
        jBtn = new javax.swing.JButton();
        eBtn = new javax.swing.JButton();
        concLeftBtn = new javax.swing.JButton();
        downBtn = new javax.swing.JButton();
        vBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        mBtn = new javax.swing.JButton();
        yBtn = new javax.swing.JButton();
        uBtn = new javax.swing.JButton();
        aBtn = new javax.swing.JButton();
        dBtn = new javax.swing.JButton();
        rBtn = new javax.swing.JButton();
        tresBtn = new javax.swing.JButton();
        oBtn = new javax.swing.JButton();
        maisBtn = new javax.swing.JButton();
        hBtn = new javax.swing.JButton();
        upBtn = new javax.swing.JButton();
        cincoBtn = new javax.swing.JButton();
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
        jPanel5 = new javax.swing.JPanel();
        spaceBtn = new javax.swing.JButton();
        padrao = spaceBtn.getBackground();
        definirNomeBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pangramaLabel = new javax.swing.JLabel();
        textArea = new javax.swing.JTextField();
        btnUltimosResultados = new javax.swing.JButton();
        btnUltimosResultados.setVisible(false);
        newGameBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        acertosMsg = new javax.swing.JLabel();
        percentMsg = new javax.swing.JLabel();
        acertoValor = new javax.swing.JLabel();
        percentValor = new javax.swing.JLabel();
        simboloPercent = new javax.swing.JLabel();
        errosMsg = new javax.swing.JLabel();
        erroValor = new javax.swing.JLabel();
        timerTextLbl = new javax.swing.JLabel();
        timerLbl = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuOpcoes = new javax.swing.JMenu();
        menuNovoJogo = new javax.swing.JMenuItem();
        itemMenuPlayer = new javax.swing.JMenuItem();
        itemMenuCorTeclado = new javax.swing.JMenu();
        itemMenuTeclaVerdeClaro = new javax.swing.JMenuItem();
        itemMenuTeclaDarkBlue = new javax.swing.JMenuItem();
        itemMenuTeclaDarkBlue2 = new javax.swing.JMenuItem();
        itemMenuTeclaCinza = new javax.swing.JMenuItem();
        itemMenuTeclaDark = new javax.swing.JMenuItem();
        itemMenuTeclaTurquesa = new javax.swing.JMenuItem();
        menuUltimosResultados = new javax.swing.JMenuItem();
        menuItemSair = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuConfigPangrama = new javax.swing.JMenu();
        itemMenuLingPangrama = new javax.swing.JMenu();
        pangramaIngles = new javax.swing.JMenuItem();
        pangramaPortugues = new javax.swing.JMenuItem();
        itemMenuGerarPang = new javax.swing.JMenuItem();
        selecionarPangrama = new javax.swing.JMenuItem();
        visualizarPangramas = new javax.swing.JMenuItem();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("aps_poo");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(37, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        oitoBtn.setText("8");
        oitoBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        oitoBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        oitoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoBtnActionPerformed(evt);
            }
        });

        menosBtn.setText("-");
        menosBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        menosBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        menosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosBtnActionPerformed(evt);
            }
        });

        lbtn.setText("L");
        lbtn.setMaximumSize(new java.awt.Dimension(48, 48));
        lbtn.setMinimumSize(new java.awt.Dimension(48, 48));
        lbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbtnActionPerformed(evt);
            }
        });

        capsBtn.setText("CAPSLOCK");
        capsBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        capsBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        capsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capsBtnActionPerformed(evt);
            }
        });

        sBtn.setText("S");
        sBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        sBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        sBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sBtnActionPerformed(evt);
            }
        });

        rightBtn.setText("→");
        rightBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        rightBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        rightBtn.setPreferredSize(new java.awt.Dimension(48, 48));
        rightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightBtnActionPerformed(evt);
            }
        });

        leftBtn.setText("←");
        leftBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        leftBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        leftBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBtnActionPerformed(evt);
            }
        });

        virgBtn.setText(",");
        virgBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        virgBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        virgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virgBtnActionPerformed(evt);
            }
        });

        kbtn.setText("K");
        kbtn.setMaximumSize(new java.awt.Dimension(48, 48));
        kbtn.setMinimumSize(new java.awt.Dimension(48, 48));
        kbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnActionPerformed(evt);
            }
        });

        aspasBtn.setText("'");
        aspasBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        aspasBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        aspasBtn.setPreferredSize(new java.awt.Dimension(39, 23));
        aspasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aspasBtnActionPerformed(evt);
            }
        });

        pBtn.setText("P");
        pBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        pBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        pBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pBtnActionPerformed(evt);
            }
        });

        tBtn.setText("T");
        tBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        tBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        tBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBtnActionPerformed(evt);
            }
        });

        pontoBtn.setText(".");
        pontoBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        pontoBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        pontoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoBtnActionPerformed(evt);
            }
        });

        quatroBtn.setText("4");
        quatroBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        quatroBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        quatroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroBtnActionPerformed(evt);
            }
        });

        seteBtn.setText("7");
        seteBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        seteBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        seteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteBtnActionPerformed(evt);
            }
        });

        backspcBtn.setText("Backspace");
        backspcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspcBtnActionPerformed(evt);
            }
        });

        xBtn.setText("X");
        xBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        xBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        xBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xBtnActionPerformed(evt);
            }
        });

        jBtn.setText("J");
        jBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        jBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        jBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActionPerformed(evt);
            }
        });

        eBtn.setText("E");
        eBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        eBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        eBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBtnActionPerformed(evt);
            }
        });

        concLeftBtn.setText("[");
        concLeftBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        concLeftBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        concLeftBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concLeftBtnActionPerformed(evt);
            }
        });

        downBtn.setText("↓");
        downBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        downBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        downBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downBtnActionPerformed(evt);
            }
        });

        vBtn.setText("V");
        vBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        vBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        vBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vBtnActionPerformed(evt);
            }
        });

        zeroBtn.setText("0");
        zeroBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        zeroBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });

        mBtn.setText("M");
        mBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        mBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        mBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnActionPerformed(evt);
            }
        });

        yBtn.setText("Y");
        yBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        yBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        yBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yBtnActionPerformed(evt);
            }
        });

        uBtn.setText("U");
        uBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        uBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        uBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uBtnActionPerformed(evt);
            }
        });

        aBtn.setText("A");
        aBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        aBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        aBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aBtnActionPerformed(evt);
            }
        });

        dBtn.setText("D");
        dBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        dBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        dBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtnActionPerformed(evt);
            }
        });

        rBtn.setText("R");
        rBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        rBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        rBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnActionPerformed(evt);
            }
        });

        tresBtn.setText("3");
        tresBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        tresBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        tresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresBtnActionPerformed(evt);
            }
        });

        oBtn.setText("O");
        oBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        oBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        oBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oBtnActionPerformed(evt);
            }
        });

        maisBtn.setText("+");
        maisBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        maisBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        maisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisBtnActionPerformed(evt);
            }
        });

        hBtn.setText("H");
        hBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        hBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        hBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hBtnActionPerformed(evt);
            }
        });

        upBtn.setText("↑");
        upBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        upBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });

        cincoBtn.setText("5");
        cincoBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        cincoBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        cincoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoBtnActionPerformed(evt);
            }
        });

        doisBtn.setText("2");
        doisBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        doisBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        doisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisBtnActionPerformed(evt);
            }
        });

        pontVirgBtn.setText(";");
        pontVirgBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        pontVirgBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        pontVirgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontVirgBtnActionPerformed(evt);
            }
        });

        tabBtn.setText("TAB");
        tabBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        tabBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        tabBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabBtnActionPerformed(evt);
            }
        });

        seisBtn.setText("6");
        seisBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        seisBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        seisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisBtnActionPerformed(evt);
            }
        });

        concRightBtn.setText("]");
        concRightBtn.setMaximumSize(new java.awt.Dimension(48, 48));
        concRightBtn.setMinimumSize(new java.awt.Dimension(48, 48));
        concRightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concRightBtnActionPerformed(evt);
            }
        });

        barraBtn.setText("\\");
            barraBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            barraBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            barraBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    barraBtnActionPerformed(evt);
                }
            });

            bBtn.setText("B");
            bBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            bBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            bBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bBtnActionPerformed(evt);
                }
            });

            iBtn.setText("I");
            iBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            iBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            iBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    iBtnActionPerformed(evt);
                }
            });

            fBtn.setText("F");
            fBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            fBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            fBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    fBtnActionPerformed(evt);
                }
            });

            enterBtn.setText("ENTER");
            enterBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            enterBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            enterBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    enterBtnActionPerformed(evt);
                }
            });

            noveBtn.setText("9");
            noveBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            noveBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            noveBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    noveBtnActionPerformed(evt);
                }
            });

            gBtn.setText("G");
            gBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            gBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            gBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    gBtnActionPerformed(evt);
                }
            });

            zBtn.setText("Z");
            zBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            zBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            zBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    zBtnActionPerformed(evt);
                }
            });

            cBtn.setText("C");
            cBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            cBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            cBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cBtnActionPerformed(evt);
                }
            });

            cdilhaBtn.setText("Ç");
            cdilhaBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            cdilhaBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            cdilhaBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cdilhaBtnActionPerformed(evt);
                }
            });

            qBtn.setText("Q");
            qBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            qBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            qBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    qBtnActionPerformed(evt);
                }
            });

            umBtn.setText("1");
            umBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            umBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            umBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    umBtnActionPerformed(evt);
                }
            });

            nBtn.setText("N");
            nBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            nBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            nBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    nBtnActionPerformed(evt);
                }
            });

            shiftBtn.setText("SHIFT");
            shiftBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            shiftBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            shiftBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    shiftBtnActionPerformed(evt);
                }
            });

            wBtn.setText("W");
            wBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            wBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            wBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    wBtnActionPerformed(evt);
                }
            });

            jPanel5.setBackground(new java.awt.Color(37, 51, 51));
            jPanel5.setMaximumSize(new java.awt.Dimension(232, 50));
            jPanel5.setMinimumSize(new java.awt.Dimension(232, 50));

            spaceBtn.setText("SPACE");
            spaceBtn.setMaximumSize(new java.awt.Dimension(48, 48));
            spaceBtn.setMinimumSize(new java.awt.Dimension(48, 48));
            spaceBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    spaceBtnActionPerformed(evt);
                }
            });

            definirNomeBtn.setBackground(new java.awt.Color(255, 255, 255));
            definirNomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editNickname.png"))); // NOI18N
            definirNomeBtn.setText("DEFINIR NICKNAME");
            definirNomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    definirNomeBtnMousePressed(evt);
                }
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    definirNomeBtnMouseReleased(evt);
                }
            });
            definirNomeBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    definirNomeBtnActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(definirNomeBtn)
                    .addGap(65, 65, 65)
                    .addComponent(spaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42))
            );
            jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(spaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(definirNomeBtn))
                    .addGap(0, 11, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(pontoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(pontVirgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(downBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20))
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
                                .addGap(2, 2, 2)
                                .addComponent(uBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(iBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(oBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(pBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(concLeftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                        .addComponent(backspcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aspasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(downBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(40, 40, 40))
            );

            jPanel4.setBackground(new java.awt.Color(37, 51, 51));

            jPanel2.setBackground(new java.awt.Color(37, 51, 51));
            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Digite o pangrama a seguir", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

            pangramaLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
            pangramaLabel.setForeground(new java.awt.Color(255, 255, 255));
            pangramaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            pangramaLabel.setText(" ");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pangramaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(132, 132, 132))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pangramaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addGap(2, 2, 2))
            );

            textArea.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
            textArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            textArea.setEditable(false);
            textArea.addCaretListener(new javax.swing.event.CaretListener() {
                public void caretUpdate(javax.swing.event.CaretEvent evt) {
                    textAreaCaretUpdate(evt);
                }
            });
            textArea.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    textAreaActionPerformed(evt);
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

            btnUltimosResultados.setBackground(new java.awt.Color(255, 255, 255));
            btnUltimosResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visualizarResultados.png"))); // NOI18N
            btnUltimosResultados.setText("ULTIMOS RESULTADOS");
            btnUltimosResultados.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnUltimosResultadosActionPerformed(evt);
                }
            });

            newGameBtn.setBackground(new java.awt.Color(255, 255, 255));
            newGameBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/novoJogo.png"))); // NOI18N
            newGameBtn.setText("NOVO JOGO");
            newGameBtn.setPreferredSize(new java.awt.Dimension(165, 25));
            newGameBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    newGameBtnActionPerformed(evt);
                }
            });

            jPanel3.setBackground(new java.awt.Color(37, 51, 51));
            jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            acertosMsg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            acertosMsg.setForeground(new java.awt.Color(0, 255, 0));
            acertosMsg.setText("Acertos");

            percentMsg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            percentMsg.setForeground(new java.awt.Color(255, 255, 255));
            percentMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            percentMsg.setText("Desempenho");

            acertoValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            acertoValor.setForeground(new java.awt.Color(255, 255, 255));
            acertoValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            acertoValor.setText("0");

            percentValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            percentValor.setForeground(new java.awt.Color(255, 255, 255));
            percentValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            percentValor.setText("0");

            simboloPercent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            simboloPercent.setForeground(new java.awt.Color(255, 255, 255));
            simboloPercent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            simboloPercent.setText("%");

            errosMsg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            errosMsg.setForeground(new java.awt.Color(255, 0, 0));
            errosMsg.setText("Erros");

            erroValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            erroValor.setForeground(new java.awt.Color(255, 255, 255));
            erroValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            erroValor.setText("0");

            timerTextLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            timerTextLbl.setForeground(new java.awt.Color(255, 255, 255));
            timerTextLbl.setText("TEMPO");

            timerLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            timerLbl.setForeground(new java.awt.Color(255, 255, 255));
            timerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            timerLbl.setText("00 : 00 ");

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(acertosMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(acertoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(74, 74, 74))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timerTextLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(erroValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(errosMsg, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(69, 69, 69)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(percentValor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(simboloPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(percentMsg)))
                        .addComponent(timerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16))
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(percentMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(errosMsg)
                        .addComponent(acertosMsg))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(acertoValor)
                        .addComponent(erroValor)
                        .addComponent(percentValor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(simboloPercent))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(timerTextLbl)
                        .addComponent(timerLbl))
                    .addGap(0, 11, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(newGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(btnUltimosResultados))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(newGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUltimosResultados)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );

            menuOpcoes.setText("Opções");

            menuNovoJogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
            menuNovoJogo.setText("Novo Jogo");
            menuNovoJogo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuNovoJogoActionPerformed(evt);
                }
            });
            menuOpcoes.add(menuNovoJogo);

            itemMenuPlayer.setText("Definir Nickname");
            itemMenuPlayer.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemMenuPlayerActionPerformed(evt);
                }
            });
            menuOpcoes.add(itemMenuPlayer);

            itemMenuCorTeclado.setText("Cor teclado");

            itemMenuTeclaVerdeClaro.setText("Verde Claro");
            itemMenuTeclaVerdeClaro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemMenuTeclaVerdeClaroActionPerformed(evt);
                }
            });
            itemMenuCorTeclado.add(itemMenuTeclaVerdeClaro);

            itemMenuTeclaDarkBlue.setText("Dark Blue");
            itemMenuTeclaDarkBlue.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemMenuTeclaDarkBlueActionPerformed(evt);
                }
            });
            itemMenuCorTeclado.add(itemMenuTeclaDarkBlue);

            itemMenuTeclaDarkBlue2.setText("Dark Blue 2");
            itemMenuTeclaDarkBlue2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemMenuTeclaDarkBlue2ActionPerformed(evt);
                }
            });
            itemMenuCorTeclado.add(itemMenuTeclaDarkBlue2);

            itemMenuTeclaCinza.setText("Cinza");
            itemMenuTeclaCinza.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemMenuTeclaCinzaActionPerformed(evt);
                }
            });
            itemMenuCorTeclado.add(itemMenuTeclaCinza);

            itemMenuTeclaDark.setText("Dark");
            itemMenuTeclaDark.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemMenuTeclaDarkActionPerformed(evt);
                }
            });
            itemMenuCorTeclado.add(itemMenuTeclaDark);

            itemMenuTeclaTurquesa.setText("Turquesa");
            itemMenuTeclaTurquesa.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemMenuTeclaTurquesaActionPerformed(evt);
                }
            });
            itemMenuCorTeclado.add(itemMenuTeclaTurquesa);

            menuOpcoes.add(itemMenuCorTeclado);

            menuUltimosResultados.setText("Visualizar Ultimos resultados");
            menuUltimosResultados.setEnabled(false);
            menuUltimosResultados.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuUltimosResultadosActionPerformed(evt);
                }
            });
            menuOpcoes.add(menuUltimosResultados);

            menuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
            menuItemSair.setText("Sair");
            menuItemSair.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuItemSairActionPerformed(evt);
                }
            });
            menuOpcoes.add(menuItemSair);

            barraMenu.add(menuOpcoes);

            jMenu1.setText("Pangramas");

            menuConfigPangrama.setText("Configurações Pangramas");

            itemMenuLingPangrama.setText("Linguagem Pangrama");

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

            jMenu1.add(menuConfigPangrama);

            visualizarPangramas.setText("Visualizar Todos os pangramas");
            visualizarPangramas.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    visualizarPangramasActionPerformed(evt);
                }
            });
            jMenu1.add(visualizarPangramas);

            barraMenu.add(jMenu1);

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
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0))
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/app.png")));
    }
    
    private String definirUser(String user){
        try {
            try (FileWriter arq = new FileWriter("C:\\aps-poo\\user.txt")) {
                PrintWriter pr = new PrintWriter(arq);
                pr.println(user);
            }
            return user;
        } catch (IOException ex) {
            Logger.getLogger(AplicationPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private void carregarUser() throws FileNotFoundException, IOException{
        try (FileReader arq = new FileReader("C:\\aps-poo\\user.txt")) {
            BufferedReader br = new BufferedReader(arq);
            Player.nome=br.readLine();
            if(Player.nome==null){
                Player.nome="USER";
            }
            arq.close();
        }
    }
    private void questionRestartGame(){
        if(!acertoValor.getText().equals("0") || !erroValor.getText().equals("0")){
            if(JOptionPane.showConfirmDialog(this, "Carregar um novo pangrama reiniciará o jogo atual", "Tem certeza?", JOptionPane.YES_NO_OPTION)==0){
               newGameStats(false);//carrega um pangrama da mesma tipagem selecionada
            }        
        }else{
            newGameStats(false);
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
   
    private void newGameStats(boolean predefined){//carrega um novo jogo sobrescrevendo o antigo(caso possuir)
        if(!predefined){
            pangramaLabel.setText(carregarPangrama());
        }else{
            pangramaLabel.setText(Pangramas.pangramaSelecionado);
        }    
        jPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                "Digite o pangrama a seguir", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
                new Font("Consolas", 1, 14), new Color(255, 255, 255)));
        resetTextArea();
        game = new Jogo();
        pangramaLabel.setForeground(Color.WHITE);
        game.inicioJogo(pangramaLabel.getText());
        alterarEstadoItensMenu(true);
        cleanScreen();
        if(!menuConfigPangrama.isEnabled()){
            menuConfigPangrama.setEnabled(true);
        }
        carregarCronometro();
        contagemTempo();
    }
    
    private void carregarCronometro(){
        timer.cancel();
        timer = new Timer();
    }
    
    private void resetTextArea(){//habilita o jTextField e remove o texto
        textArea.setEditable(true);
        textArea.setText("");
        textArea.requestFocus();
    }
    
    
    private void alterarEstadoItensMenu(boolean state){
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
        timerLbl.setText("00 : 00");
    }
    
    private void newGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameBtnActionPerformed
        if(AplicationPangramas.resetGame==1){
            newGameStats(true);//chama o metodo para carregar um novo jogo de maneira predefinida
            AplicationPangramas.resetGame=0;
        }else{
            newGameStats(false);//chama o metodo para carregar um novo jogo de maneira aleatoria
        }
    }//GEN-LAST:event_newGameBtnActionPerformed

    private void visualizarPangramasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarPangramasActionPerformed
        AplicationPangramas app = new AplicationPangramas(this, true, true);
        app.setVisible(true);
    }//GEN-LAST:event_visualizarPangramasActionPerformed

    private void selecionarPangramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarPangramaActionPerformed
        AplicationPangramas app = new AplicationPangramas(this, true);
        app.setVisible(true);
    }//GEN-LAST:event_selecionarPangramaActionPerformed

    private void btnUltimosResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimosResultadosActionPerformed
        AplicationJogos app = new AplicationJogos(this, true, resultados);
        app.setVisible(true);
    }//GEN-LAST:event_btnUltimosResultadosActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        //metodo que trata a finalização do programa
        if (JOptionPane.showConfirmDialog(this , "Todo o seu progresso será perdido", "Tem certeza?", DISPOSE_ON_CLOSE,JOptionPane.WARNING_MESSAGE)==0) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuUltimosResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUltimosResultadosActionPerformed
        AplicationJogos app = new AplicationJogos(this, true, resultados);
        app.setVisible(true);
    }//GEN-LAST:event_menuUltimosResultadosActionPerformed

    private void menuNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovoJogoActionPerformed
        if(AplicationPangramas.resetGame==1){
            newGameStats(true);//chama o metodo para carregar um novo jogo de maneira predefinida
            AplicationPangramas.resetGame=0;
        }else{
            newGameStats(false);//chama o metodo para carregar um novo jogo de maneira aleatoria
        }
            
    }//GEN-LAST:event_menuNovoJogoActionPerformed

    private void textAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyReleased
              
       trocaFundo(verificaTeclaInput(evt.getKeyChar(), evt.getKeyCode()),1);//Troca o fundo das teclas
    }//GEN-LAST:event_textAreaKeyReleased

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
                capsBtn.setBackground(cor);
                capsFlag = true;
            }
            break;
            default:
            flagTeclas = 0;//desativa a flag caso negativo
            break;
        }
        trocaFundo(verificaTeclaInput(evt.getKeyChar(), evt.getKeyCode()),0);//Troca o fundo das teclas
    }//GEN-LAST:event_textAreaKeyPressed

    private void textAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAreaActionPerformed

    private void textAreaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textAreaCaretUpdate
        if(textArea.isEditable()){
            if(textArea.getText().length()==0){
                return;
            }else{
                if(textArea.isEditable()){
                    newGameBtn.setVisible(true);
                }
            }
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
                timer.cancel();
                resultados.pressetValue(Player.nome,pangramaLabel.getText(), game.getAcertos(), game.getErros(), game.getPercent(),timerLbl.getText());
                if(!btnUltimosResultados.isVisible() && !menuUltimosResultados.isEnabled()){
                    btnUltimosResultados.setVisible(true);
                    menuUltimosResultados.setEnabled(true);
                }
                jPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "PANGRAMA COMPLETO", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font("Consolas", 1, 14), new Color(255, 255, 255)));
                pangramaLabel.setForeground(Color.GREEN);
                textArea.setEditable(false);
                menuConfigPangrama.setEnabled(false);
            }
        }
    }//GEN-LAST:event_textAreaCaretUpdate

    private void itemMenuPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuPlayerActionPerformed
        definirNome();
    }//GEN-LAST:event_itemMenuPlayerActionPerformed
        
    private void itemMenuTeclaVerdeClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuTeclaVerdeClaroActionPerformed
        setBackgroundColor((float)0.3, (float)0.5, (float)0.8);
    }//GEN-LAST:event_itemMenuTeclaVerdeClaroActionPerformed

    private void itemMenuTeclaDarkBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuTeclaDarkBlueActionPerformed
        setBackgroundColor((float)0.666, (float)0.666, (float)0.666);
    }//GEN-LAST:event_itemMenuTeclaDarkBlueActionPerformed

    private void itemMenuTeclaCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuTeclaCinzaActionPerformed
        setBackgroundColor(Color.GRAY);
    }//GEN-LAST:event_itemMenuTeclaCinzaActionPerformed

    private void itemMenuTeclaDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuTeclaDarkActionPerformed
        setBackgroundColor((float)0, (float)0, (float)0);
    }//GEN-LAST:event_itemMenuTeclaDarkActionPerformed

    private void definirNomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_definirNomeBtnActionPerformed
        definirNome();
        textArea.requestFocus();
    }//GEN-LAST:event_definirNomeBtnActionPerformed

    private void definirNomeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_definirNomeBtnMousePressed
        definirNomeBtn.setBackground(cor);
    }//GEN-LAST:event_definirNomeBtnMousePressed

    private void definirNomeBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_definirNomeBtnMouseReleased
        definirNomeBtn.setBackground(padrao);
    }//GEN-LAST:event_definirNomeBtnMouseReleased
    //Ações botoes teclado ao serem clicados com o mouse
    private void doisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_doisBtnActionPerformed

    private void aspasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aspasBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_aspasBtnActionPerformed

    private void umBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_umBtnActionPerformed

    private void tresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_tresBtnActionPerformed

    private void quatroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_quatroBtnActionPerformed

    private void cincoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_cincoBtnActionPerformed

    private void seisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_seisBtnActionPerformed

    private void seteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_seteBtnActionPerformed

    private void oitoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_oitoBtnActionPerformed

    private void noveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_noveBtnActionPerformed

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void menosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_menosBtnActionPerformed

    private void maisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_maisBtnActionPerformed

    private void backspcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspcBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_backspcBtnActionPerformed

    private void tabBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_tabBtnActionPerformed

    private void qBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_qBtnActionPerformed

    private void wBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_wBtnActionPerformed

    private void eBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_eBtnActionPerformed

    private void rBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_rBtnActionPerformed

    private void tBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_tBtnActionPerformed

    private void yBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_yBtnActionPerformed

    private void uBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_uBtnActionPerformed

    private void iBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_iBtnActionPerformed

    private void oBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_oBtnActionPerformed

    private void pBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_pBtnActionPerformed

    private void concLeftBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concLeftBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_concLeftBtnActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_enterBtnActionPerformed

    private void capsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capsBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_capsBtnActionPerformed

    private void aBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_aBtnActionPerformed

    private void sBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_sBtnActionPerformed

    private void dBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_dBtnActionPerformed

    private void fBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_fBtnActionPerformed

    private void gBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_gBtnActionPerformed

    private void hBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_hBtnActionPerformed

    private void jBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_jBtnActionPerformed

    private void kbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_kbtnActionPerformed

    private void lbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_lbtnActionPerformed

    private void cdilhaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdilhaBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_cdilhaBtnActionPerformed

    private void concRightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concRightBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_concRightBtnActionPerformed

    private void shiftBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_shiftBtnActionPerformed

    private void barraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_barraBtnActionPerformed

    private void zBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_zBtnActionPerformed

    private void xBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_xBtnActionPerformed

    private void cBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_cBtnActionPerformed

    private void vBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_vBtnActionPerformed

    private void bBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_bBtnActionPerformed

    private void nBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_nBtnActionPerformed

    private void mBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_mBtnActionPerformed

    private void virgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virgBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_virgBtnActionPerformed

    private void pontoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_pontoBtnActionPerformed

    private void pontVirgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontVirgBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_pontVirgBtnActionPerformed

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_upBtnActionPerformed

    private void leftBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_leftBtnActionPerformed

    private void downBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_downBtnActionPerformed

    private void rightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_rightBtnActionPerformed

    private void spaceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaceBtnActionPerformed
        textArea.requestFocus();
    }//GEN-LAST:event_spaceBtnActionPerformed


    private void itemMenuTeclaDarkBlue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuTeclaDarkBlue2ActionPerformed
        setBackgroundColor((float)0.667, (float)0.29, (float)0.545);
    }//GEN-LAST:event_itemMenuTeclaDarkBlue2ActionPerformed

    private void itemMenuTeclaTurquesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuTeclaTurquesaActionPerformed
        setBackgroundColor((float)0.436, (float)0.700, (float)0.745);
    }//GEN-LAST:event_itemMenuTeclaTurquesaActionPerformed

    private void itemMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSobreActionPerformed
        AplicationSobre app =new AplicationSobre(this,true,version);
        app.setVisible(true);
    }//GEN-LAST:event_itemMenuSobreActionPerformed

    private void itemMenuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAjudaActionPerformed
        AplicationMenuAjuda app = new AplicationMenuAjuda(this, true);
        app.setVisible(true);
    }//GEN-LAST:event_itemMenuAjudaActionPerformed
    
    private void setBackgroundColor(float h, float s, float b){
        cor = Color.getHSBColor(h, s, b);
        JOptionPane.showMessageDialog(this, "Salvo com sucesso!", "COR DEFINIDA", JOptionPane.INFORMATION_MESSAGE);
        textArea.requestFocus();
    }
    
    private void setBackgroundColor(Color color){
        cor = color;
        JOptionPane.showMessageDialog(this, "Salvo com sucesso!", "COR DEFINIDA", JOptionPane.INFORMATION_MESSAGE);
        textArea.requestFocus();
    }
    
    private String carregarPangrama(){
        //metodo para carregar o pangrama ativo na memoria
        String pangrama;
        do{ 
            pangrama = pangramas.carregarPangrama();
        }while(pangramaLabel.getText().equals(pangrama));//Evita sobrescrição de um pangrama anterior pelo mesmo posterior
        
        return pangrama;
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
        //metodo para trocar a cor de fundo dos buttons - 0 para mudar para a cor personalizada
        //1 para retornar a cor padrao
        if(btn == null)
            return;

        if(btnLast == null ){//verifica se o btnLast é vazio
            btnLast = btn;//seta o botao atual para o btnlast
        }
        
        if(flag==0){
            btn.setBackground(cor);
        }else{
            btn.setBackground(padrao);
        }
    }
    
    private void definirNome(){
        short i=0;
        String nick;
        do{
            
          if(i==0){
            nick= JOptionPane.showInputDialog(this,"Nick atual: "+Player.nome+
                    "\n(Min. 3 Letras - Max. 8 Letras)","Insira seu nick",
                    JOptionPane.PLAIN_MESSAGE);
              
          }else{
            nick= JOptionPane.showInputDialog(this,"Nick atual: "+Player.nome+
                    "\n(Min. 3 Letras - Max. 8 Letras)",
                    "Insira seu nick - [Nome inválido]", JOptionPane.PLAIN_MESSAGE);
              
          }
          
          if(nick==null){
              break;
          }else if(nick.trim().length()<3 || nick.trim().length()>8){
              i=1;
          }else{
               Player.nome=definirUser(nick.toUpperCase());
          }
          
        }while(nick.trim().length()<3 || nick.trim().length()>8);
    }
    
    private void contagemTempo(){
        if(cont!= 0){
            cont =0;
        }
        
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                cont++;
                int segundos = cont % 60;
                int minutos = cont / 60;
                timerLbl.setText(String.format("%02d : %02d", minutos, segundos));
            }
        }, 1000, 1000);
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
    private javax.swing.JButton definirNomeBtn;
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
    private javax.swing.JMenu itemMenuCorTeclado;
    private javax.swing.JMenuItem itemMenuGerarPang;
    private javax.swing.JMenu itemMenuLingPangrama;
    private javax.swing.JMenuItem itemMenuPlayer;
    private javax.swing.JMenuItem itemMenuSobre;
    private javax.swing.JMenuItem itemMenuTeclaCinza;
    private javax.swing.JMenuItem itemMenuTeclaDark;
    private javax.swing.JMenuItem itemMenuTeclaDarkBlue;
    private javax.swing.JMenuItem itemMenuTeclaDarkBlue2;
    private javax.swing.JMenuItem itemMenuTeclaTurquesa;
    private javax.swing.JMenuItem itemMenuTeclaVerdeClaro;
    private javax.swing.JButton jBtn;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
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
    private javax.swing.JButton kbtn;
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
    private javax.swing.JMenuItem menuUltimosResultados;
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
    private javax.swing.JTextField textArea;
    private javax.swing.JLabel timerLbl;
    private javax.swing.JLabel timerTextLbl;
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
