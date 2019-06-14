import https.dhl24_com_pl.webapi2.provider.service.*;
import https.dhl24_com_pl.webapi2.provider.service.Package;
import https.dhl24_com_pl.webapi2.provider.service_html_ws_1.DHL24WebapiPort;
import https.dhl24_com_pl.webapi2.provider.service_html_ws_1.DHL24WebapiService;
import model.Client;
import sun.util.calendar.BaseCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.*;
import javax.xml.bind.DatatypeConverter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainForm {
    private JButton zarejestrujButton;
    private JButton zalogujButton;
    private JTextField loginField;
    private JTextField passwordField;
    public JPanel mainPanel;
    private JPanel cardPanel;
    private JPanel loginPane;
    private JButton zarejestrujSięButton;
    private JTextField loginRegister;
    private JTextField hasloRegister;
    private JTextField imieRegister;
    private JTextField nazwiskoRegister;
    private JTextField ulicaRegister;
    private JTextField numerDomuRegister;
    private JTextField kodzPocztowyRegister;
    private JTextField miejscowoscRegister;
    private JTextField numerTelefonuRegister;
    private JPanel registerPane;
    private JButton wylogujButton;
    private JButton wyślijButton;
    private JTextField nadwacaNumerTelefonu;
    private JTextField adresatImie;
    private JTextField nadwacaMiejscowosc;
    private JTextField nadwacaKodPocztowy;
    private JTextField nadwacaNumerDOmu;
    private JTextField nadwacaUlica;
    private JTextField nadwacaNazwisko;
    private JTextField nadawcaImie;
    private JTextField adresatNazwisko;
    private JTextField adresatUlica;
    private JTextField adresatNumerDomu;
    private JTextField adresatKodPocztowy;
    private JTextField adresatMiejscowosc;
    private JTextField adresatNumerTelefonu;
    private JTextField paczkaWaga;
    private JTextField paczkaSzerokosc;
    private JTextField paczkaWysokosc;
    private JTextField paczkaDlugosc;
    private JPanel mainPane;
    private JTextField paczkaIlosc;
    private JTextField paczkaZawartosc;
    private JCheckBox paczkaCheckZwrot;
    private JTextField paczkaUwagi;
    private JComboBox paczkaRodzaj;
    private JLabel uwagi;
    private JPanel nadawcaPanel;
    private JPanel adresatPanel;
    private JPanel paczkaPanel;
    private JButton wsteczButton;

    private static EntityManagerFactory entityManagerFactory;
    private  static EntityManager entityManager;


    public MainForm() {
        paczkaRodzaj.addItem("Przesyłka kopertowa");
        paczkaRodzaj.addItem("Paczka");
        paczkaRodzaj.addItem("Paleta");

        zalogujButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                zaloguj();

                cardPanel.removeAll();
                cardPanel.repaint();
                cardPanel.revalidate();

                cardPanel.add(mainPane);
                cardPanel.repaint();
                cardPanel.revalidate();
            }
        });
        zarejestrujButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                cardPanel.removeAll();
                cardPanel.repaint();
                cardPanel.revalidate();

                cardPanel.add(registerPane);
                cardPanel.repaint();
                cardPanel.revalidate();
            }
        });
        wylogujButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                cardPanel.removeAll();
                cardPanel.repaint();
                cardPanel.revalidate();

                cardPanel.add(loginPane);
                cardPanel.repaint();
                cardPanel.revalidate();
            }
        });
        zarejestrujSięButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                zarejestruj();

                JOptionPane.showMessageDialog(null,"zarejestrowano !");

            }
        });
        wsteczButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {

                cardPanel.removeAll();
                cardPanel.repaint();
                cardPanel.revalidate();

                cardPanel.add(loginPane);
                cardPanel.repaint();
                cardPanel.revalidate();

            }
        });
        wyślijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    wygenerujprzesylke();
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Wysyłka paczki nie powiodła się");
                    System.out.println("wysyłka nie powiodła sie");
                }
            }
        });
    }

    public void zaloguj() {

        entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.jpa" );
        entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Client> criteriaQuery = criteriaBuilder.createQuery(Client.class);
        Root<Client> root = criteriaQuery.from(Client.class);
        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("login"), loginField.getText()));
        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("password"), passwordField.getText()));
        TypedQuery<Client> query = entityManager.createQuery(criteriaQuery);
        Client zalogowanyClient  = query.getSingleResult();

        if(zalogowanyClient != null){

            JOptionPane.showMessageDialog(null,"zalogowano");

        }
        nadawcaImie.setText(zalogowanyClient.getImie());
        nadwacaNazwisko.setText(zalogowanyClient.getNazwisko());
        nadwacaKodPocztowy.setText(zalogowanyClient.getKodPocztowy());
        nadwacaMiejscowosc.setText(zalogowanyClient.getMiejscowosc());
        nadwacaNumerDOmu.setText(zalogowanyClient.getNumerDomu());
        nadwacaNumerTelefonu.setText(zalogowanyClient.getNumerTelefonu());
        nadwacaUlica.setText(zalogowanyClient.getUlica());

        entityManager.getTransaction().commit();

        entityManager.close();
    }

    public void zarejestruj() {

        entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.jpa" );
        entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Client client = new Client();
        client.setLogin(loginRegister.getText());
        client.setPassword(loginRegister.getText());
        client.setImie(imieRegister.getText());
        client.setNazwisko(nazwiskoRegister.getText());
        client.setMiejscowosc(miejscowoscRegister.getText());
        client.setKodPocztowy(kodzPocztowyRegister.getText());
        client.setNumerDomu(numerDomuRegister.getText());
        client.setUlica(numerDomuRegister.getText());
        client.setNumerTelefonu(numerTelefonuRegister.getText());

        entityManager.persist(client);

        entityManager.getTransaction().commit();

        entityManager.close();


    }

    public void wygenerujprzesylke() throws IOException {

        final DHL24WebapiPort service = new DHL24WebapiService().getDHL24WebapiPort();

        System.out.println("Autoryzacja...");
        final AuthData auth = new AuthData();
        auth.setUsername("STARADAMALEGIAWARSZAWA");
        auth.setPassword("QRsb5lCEWwln:Rg");

        System.out.println("CreateShipmentRequest...");
//        GetVersion getVersion = new GetVersion()
        final CreateShipmentRequest request = new CreateShipmentRequest();
        request.setContent(paczkaZawartosc.getText());

        request.setShipmentInfo(new ShipmentInfo());
        //przesylka krajowa
        request.getShipmentInfo().setServiceType("AH");
        //przesylka bez restrykcji
        request.getShipmentInfo().setDropOffType("REGULAR_PICKUP");
        //list przewozowy
        request.getShipmentInfo().setLabelType("LP");

        request.setComment(paczkaUwagi.getText());


        request.getShipmentInfo().setShipmentTime(new ShipmentTime());
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalTime endtime = LocalTime.now().plusHours(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        request.getShipmentInfo().getShipmentTime().setShipmentDate(date.format(formatter));
        request.getShipmentInfo().getShipmentTime().setShipmentStartHour(time.format(timeFormatter));
        request.getShipmentInfo().getShipmentTime().setShipmentEndHour(endtime.format(timeFormatter));

        request.getShipmentInfo().setBilling(new Billing());
        //nadawca ponosi koszta dostawy
        request.getShipmentInfo().getBilling().setShippingPaymentType("SHIPPER");
        //platnosc przelewem
        request.getShipmentInfo().getBilling().setPaymentType("BANK_TRANSFER");
        request.getShipmentInfo().getBilling().setBillingAccountNumber(2381128);

        final Package pkg = new Package();
        //ENVELOPE - przesylka kopertowa, PACKAGE-paczka PALLET - paleta
        if(paczkaRodzaj.getSelectedItem().equals("Paczka")){
            pkg.setType("PACKAGE");
        } else if (paczkaRodzaj.getSelectedItem().equals("Przesyłka kopertowa")){
            pkg.setType("ENVELOPE");
        } else if(paczkaRodzaj.getSelectedItem().equals("Paleta")) {
            pkg.setType("PALLET");
        }

        pkg.setQuantity(Integer.parseInt(paczkaIlosc.getText()));
        pkg.setHeight(Integer.parseInt(paczkaWysokosc.getText()));
        pkg.setWidth(Integer.parseInt(paczkaSzerokosc.getText()));
        pkg.setLength(Integer.parseInt(paczkaDlugosc.getText()));
        pkg.setWeight(Integer.parseInt(paczkaWaga.getText()));
        if(paczkaCheckZwrot.isSelected()){
            pkg.setEuroReturn(true);
        } else {
            pkg.setEuroReturn(false);
        }



        request.setPieceList(new ArrayOfPackage());
        request.getPieceList().getItem().add(pkg);

        request.setShip(new Ship());
        request.getShip().setShipper(new Addressat());
        request.getShip().getShipper().setAddress(new Address());
        request.getShip().getShipper().getAddress().setName(nadawcaImie.getText()+" "+ nadwacaNazwisko.getText());
        request.getShip().getShipper().getAddress().setPostalCode(nadwacaKodPocztowy.getText());
        request.getShip().getShipper().getAddress().setCity(nadwacaMiejscowosc.getText());
        request.getShip().getShipper().getAddress().setStreet(nadwacaUlica.getText());
        request.getShip().getShipper().getAddress().setHouseNumber(nadwacaNumerDOmu.getText());
        request.getShip().setReceiver(new ReceiverAddressat());
        request.getShip().getReceiver().setAddress(new ReceiverAddress());
        request.getShip().getReceiver().getAddress().setName(adresatImie.getText()+" "+adresatNazwisko.getText());
        request.getShip().getReceiver().getAddress().setPostalCode(adresatKodPocztowy.getText());
        request.getShip().getReceiver().getAddress().setCity(adresatMiejscowosc.getText());
        request.getShip().getReceiver().getAddress().setStreet(adresatUlica.getText());
        request.getShip().getReceiver().getAddress().setHouseNumber(adresatNumerDomu.getText());
        request.getShip().getReceiver().getAddress().setCountry("PL");


        final CreateShipmentResponse2 response = service.createShipment(auth, request);

        System.out.println("zapis response do pliku...");
        final byte[] content = DatatypeConverter.parseBase64Binary(response.getLabel().getLabelContent());
        final FileOutputStream file = new FileOutputStream(date+"_"+paczkaZawartosc.getText()+"_"+Math.random()+"result.pdf", false);
        file.write(content, 0, content.length);
        file.close();
        JOptionPane.showMessageDialog(null, "Wysłano przesyłke");


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
