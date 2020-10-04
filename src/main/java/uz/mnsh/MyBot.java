package uz.mnsh;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {


    public void onUpdateReceived(Update update) {

        final String start = "/start";
        final String back = "\uD83D\uDCA0 Bosh sahifaga o'tish \uD83D\uDCA0";
        final String internetPackage = "\uD83C\uDF10 Internet Paketlari";
        final String tariffs = "\uD83D\uDCD8 Tariflar";
        final String minutesSms = "\uD83D\uDCDE Daqiqa va \uD83D\uDCE9 SMS";
        final String ussdCode = "\uD83D\uDCF2 USSD kodlar";
        final String creator = "\uD83D\uDC68\uD83C\uDFFB\u200D\uD83D\uDCBB Creator bilan bog'lanish";
        final String diller = "⭐ Diller bilan bog'lanish ⭐";
        final String internetMonth = "\uD83C\uDF10 Oylik paketlar";
        final String internetDay = "\uD83C\uDF10 Kunlik paketlar";
        final String internetNight = "\uD83C\uDF10 Tungi internet";
        final String internetNonStop = "\uD83C\uDF10 Internet non-stop";
        final String[] packages = {"500 MB", "1 500 MB", "3 000 MB", "5 000 MB", "8 000 MB", "12 000 MB",
                "20 000 MB", "30 000 MB", "50 000 MB", "75 000 MB"};
        final String package0 = "Internet paketi 500 MB\nNarxi 10 000 so'm\nKodi *147*10072*52400#";
        final String package1 = "Internet paketi 1500 MB\nNarxi 15 000 so'm\nKodi *147*10073*52400#";
        final String package2 = "Internet paketi 3000 MB\nNarxi 24 000 so'm\nKodi *147*10074*52400#";
        final String package3 = "Internet paketi 5000 MB\nNarxi 32 000 so'm\nKodi *147*10075*52400#";
        final String package4 = "Internet paketi 8000 MB\nNarxi 41 000 so'm\nKodi *147*10076*52400#";
        final String package5 = "Internet paketi 12000 MB\nNarxi 50 000 so'm\nKodi *147*10077*52400#";
        final String package6 = "Internet paketi 20000 MB\nNarxi 65 000 so'm\nKodi *147*10078*52400#";
        final String package7 = "Internet paketi 30000 MB\nNarxi 75 000 so'm\nKodi *147*10079*52400#";
        final String package8 = "Internet paketi 50000 MB\nNarxi 85 000 so'm\nKodi *147*10080*52400#";
        final String package9 = "Internet paketi 75000 MB\nNarxi 110 000 so'm\nKodi *147*10150*52400#";
        final String packagesDay = "\uD83C\uDF10KUNLIK PAKETLAR\uD83C\uDF10" +
                "\n\n➖➖➖➖➖➖➖" +
                "\n100 MB\nNarxi: 3 000 so'm\nKod: *147*10043*52400#\n" +
                "➖➖➖➖➖➖➖" +
                "\n300 DAQIQA\nNarxi: 10 000 so'm\nKod: *147*10050*52400#\n" +
                "➖➖➖➖➖➖➖" +
                "\n600 DAQIQA\nNarxi: 16 000 so'm\nKod: *147*10051*52400#\n" +
                "➖➖➖➖➖➖➖" +
                "\n\nPaketlarning amal qilish\nmuddati: 24 soat!";
        final String packagesNight = "\uD83C\uDF10TUNGI PAKETLAR\uD83C\uDF10" +
                "\n\n➖➖➖➖➖➖➖" +
                "\nTUN VIP\nNarxi: 6 300 so'm\nKod: *111*2*18*1#\n" +
                "➖➖➖➖➖➖➖" +
                "\n7 TUN VIP\nNarxi: 31 500 so'm\nKod: *111*2*18*3#\n" +
                "➖➖➖➖➖➖➖" +
                "\n30 TUN VIP\nNarxi: 99 000 so'm\nKod: *111*2*18*2#\n" +
                "➖➖➖➖➖➖➖" +
                "\n\nPaketlarning amal qilish\nmuddati batafsil bu yerda:\nhttps://uztelecom.uz/uz/jismoniy-shaxslarga/mobil-aloqa/gsm-2/xizmatlar/tungi-internet-4!";
        final String packagesNonstop = "\uD83C\uDF10NON-STOP PAKETLAR\uD83C\uDF10" +
                "\n\n➖➖➖➖➖➖➖" +
                "\n3 000 MB\nNarxi: 24 000 so'm\nKod: *147*10155*52400#\n" +
                "➖➖➖➖➖➖➖" +
                "\n5 000 MB\nNarxi: 32 000 so'm\nKod: *147*10156*52400#\n" +
                "➖➖➖➖➖➖➖" +
                "\n8 000 MB\nNarxi: 41 000 so'm\nKod: *147*10157*52400#\n" +
                "➖➖➖➖➖➖➖" +
                "\n12 000 MB\nNarxi: 50 000 so'm\nKod: *147*10151*52400#\n" +
                "➖➖➖➖➖➖➖" +
                "\n20 000 MB\nNarxi: 65 000 so'm\nKod: *147*10152*52400#\n" +
                "➖➖➖➖➖➖➖" +
                "\n30 000 MB\nNarxi: 75 000 so'm\nKod: *147*10153*52400#\n" +
                "➖➖➖➖➖➖➖" +
                "\n50 000 MB\nNarxi: 85 000 so'm\nKod: *147*10154*52400#\n" +
                "➖➖➖➖➖➖➖" +
                "\n\nPaketlarning amal qilish\nmuddati: 30 kun!";
        final String tariffOddiy10 = "\uD83D\uDCD8 Oddiy 10 tarifi";
        final String tariffOnlime = "\uD83D\uDCD8 Onlime tarifi";
        final String tariffStreet = "\uD83D\uDCD8 Street tarifi";
        final String tariffStreetUp = "\uD83D\uDCD8 Street Upgrade tarifi";
        final String tariffFlash = "\uD83D\uDCD8 Flash tarifi";
        final String tariffFlashUp = "\uD83D\uDCD8 Flash Upgrade tarifi";
        final String tariffRoyal = "\uD83D\uDCD8 Royal tarifi";
        final String tariffIshbilarmon = "\uD83D\uDCD8 Ishbilarmon tarifi";
        final String tariffTalim = "\uD83D\uDCD8 Ta'lim tarifi";

        final String tariffTextOddiy10 = "\"ODDIY 10\" TARIFI:\n\n\uD83D\uDCB0 Abanent to'lovi oyiga: 10000 so'm\n" +
                "\uD83D\uDCDE O'zbekiston bo'yicha: 10 daqiqa \n" +
                "\uD83C\uDF10️Mobil internet: 10 MB\n" +
                "✉ O'zbekiston bo'yicha: 10 SMS\n" +
                "\n" +
                "⏱ O'zbekiston bo'yicha daqiqa 10 so'm (limitdan tashqari)\n" +
                "1MB internet trafik: 10 so'm (limitdan tashqari)\n" +
                "O'zbekiton bo'ylab SMS: 10 so'm (limitdan tashqari)\n" +
                "\n" +
                "\uD83D\uDD0D Tarifga o'tish kodi: *111*1*11*12#";
        final String tariffTextOnlime = "\"ONLIME\" TARIFI:\n\n \uD83D\uDCB0 Abanent to'lovi oyiga: 49900 so'm\n" +
                "\uD83D\uDCDE O'zbekiston bo'yicha: 1000 daqiqa \n" +
                "Tarmoq ichida: 2000 daqiqa \n" +
                "\uD83C\uDF10 Mobil internet: 10000 MB\n" +
                "✉️O'zbekiston bo'yicha: 1000 SMS\n" +
                "\n" +
                "O'zbekiston bo'yicha daqiqa 84 so'm (limitdan tashqari)\n" +
                "1MB internet trafik: 280 so'm (limitdan tashqari)\n" +
                "O'zbekiton bo'ylab SMS: 84 so'm (limitdan tashqari)\n" +
                "\n" +
                "\uD83D\uDD0D Tarifga o'tish kodi: *111*1*11*6#";
        final String tariffTextFlash = "\"FLASH\" TARIFI:\n\n\uD83D\uDCB0 Abanent to'lovi oyiga: 69900 so'm\n" +
                "\uD83D\uDCDE O'zbekiston bo'yicha: 1500 daqiqa \n" +
                "\uD83C\uDF10 Tarmoq ichida: 2000 daqiqa \n" +
                "\uD83C\uDF10 Mobil internet: 16000 MB\n" +
                "✉️O'zbekiston bo'yicha: 1500 SMS\n" +
                "\n" +
                "O'zbekiston bo'yicha daqiqa 84 so'm (limitdan tashqari)\n" +
                "1MB internet trafik: 160 so'm (limitdan tashqari)\n" +
                "O'zbekiton bo'ylab SMS: 84 so'm (limitdan tashqari)\n" +
                "\n" +
                "\uD83D\uDD0D Tarifga o'tish kodi: *111*1*11*2*1#";
        final String tariffTextFlashUp = "\"FLASH UPGRADE\" TARIFI:\n\n\uD83D\uDCB0 Abanent to'lovi 3 oyga: 209700 so'm\n" +
                "\uD83D\uDCDE O'zbekiston bo'yicha 3 oyga: 6000 daqiqa \n" +
                "Tarmoq ichida 3 oyga: 8000 daqiqa \n" +
                "\uD83C\uDF10 Mobil internet 3 oyga: 64000 MB\n" +
                "✉️O'zbekiston bo'yicha 3 oyga: 6000 SMS\n" +
                "\n" +
                "O'zbekiston bo'yicha daqiqa 84 so'm (limitdan tashqari)\n" +
                "1MB internet trafik: 280 so'm (limitdan tashqari)\n" +
                "O'zbekiton bo'ylab SMS: 84 so'm (limitdan tashqari)\n" +
                "\n" +
                "\uD83D\uDD0D Tarifga o'tish kodi: *111*1*11*5*1#";
        final String tariffTextStreet = "\"STREET\" TARIFI:\n\n\uD83D\uDCB0 Abanent to'lovi oyiga: 39900 so'm\n" +
                "\uD83D\uDCDE O'zbekiston bo'yicha: 750 daqiqa \n" +
                "Tarmoq ichida: 1500 daqiqa \n" +
                "\uD83C\uDF10 Mobil internet: 6500 MB\n" +
                "✉️O'zbekiston bo'yicha: 750 SMS\n" +
                "\n" +
                "O'zbekiston bo'yicha daqiqa 126 so'm (limitdan tashqari)\n" +
                "1MB internet trafik: 160 so'm (limitdan tashqari)\n" +
                "O'zbekiton bo'ylab SMS: 84 so'm (limitdan tashqari)\n" +
                "\n" +
                "\uD83D\uDD0D Tarifga o'tish kodi: *111*1*11*1*1#";
        final String tariffTextStreetUp = "\"STREET UPGRADE\" TARIFI:\n\n\uD83D\uDCB0 Abanent to'lovi 3 oyga: 119700 so'm\n" +
                "\uD83D\uDCDE O'zbekiston bo'yicha 3 oyga: 3000 daqiqa\n" +
                "Tarmoq ichida 3 oyga: 6000 daqiqa \n" +
                "\uD83C\uDF10 Mobil internet 3 oyga: 26000 MB\n" +
                "✉️O'zbekiston bo'yicha 3 oyga: 3000 SMS\n" +
                "\n" +
                "O'zbekiston bo'yicha daqiqa 126 so'm (limitdan tashqari)\n" +
                "1MB internet trafik: 280 so'm (limitdan tashqari)\n" +
                "O'zbekiton bo'ylab SMS: 84 so'm (limitdan tashqari)\n" +
                "\n" +
                "\uD83D\uDD0D Tarifga o'tish kodi: *111*1*11*4*1#";
        final String tariffTextRoyal = "\"ROYAL\" TARIFI:\n\n\uD83D\uDCB0 Abanent to'lovi oyiga: 149900 so'm\n" +
                "\uD83D\uDCDE O'zbekiston bo'yicha: Cheksiz daqiqa \n" +
                "\uD83C\uDF10 Mobil internet: Cheksiz MB\n" +
                "✉️O'zbekiston bo'yicha: 5000 SMS\n" +
                "\n" +
                "O'zbekiston bo'yicha daqiqa 0 so'm (limitdan tashqari)\n" +
                "1MB internet trafik: 0 so'm (limitdan tashqari)\n" +
                "O'zbekiton bo'ylab SMS: 80 so'm (limitdan tashqari)\n" +
                "\n" +
                "\uD83D\uDD0D Tarifga o'tish kodi: *111*1*11*3*1#";
        final String tariffTextIshbilarmon = "\"ISHBILARMON\" TARIFI:\n\n\uD83D\uDCB0 Abanent to'lovi oyiga: 99000 so'm\n" +
                "\uD83D\uDCDE O'zbekiston bo'yicha: Cheksiz daqiqa \n" +
                "\uD83C\uDF10 Mobil internet: 25000 MB\n" +
                "✉️O'zbekiston bo'yicha: 3000 SMS\n" +
                "\n" +
                "O'zbekiston bo'yicha daqiqa 0 so'm (limitdan tashqari)\n" +
                "1MB internet trafik: 350 so'm (limitdan tashqari)\n" +
                "O'zbekiton bo'ylab SMS: 80 so'm (limitdan tashqari)\n" +
                "\n" +
                "\uD83D\uDD0D Tarifga o'tish kodi: *111*1/2/3*11*10#";
        final String tariffTextTalim = "\"TA'LIM\" TARIFI:\n\n\uD83D\uDCB0 Abanent to'lovi oyiga: 34900 so'm\n" +
                "\uD83D\uDCDE O'zbekiston bo'yicha: 300 daqiqa \n" +
                "Tarif rejasi doirasida: 1000 daqiqa \n" +
                "\uD83C\uDF10 Mobil internet: 8000 MB\n" +
                "✉️O'zbekiston bo'yicha: 500 SMS\n" +
                "\n" +
                "O'zbekiston bo'yicha daqiqa 40 so'm (limitdan tashqari)\n" +
                "1MB internet trafik: 40 so'm (limitdan tashqari)\n" +
                "O'zbekiton bo'ylab SMS: 84 so'm (limitdan tashqari)\n" +
                "\n" +
                "\uD83D\uDD0D Tarifga o'tish uchun batafsil ma'lumot:\nhttps://uztelecom.uz/uz/jismoniy-shaxslarga/mobil-aloqa/gsm-2/tariflar/talim-2";
        final String minutes = "\uD83D\uDCDE Daqiqalar to'plamlari";
        final String sms = "\uD83D\uDCE9 SMS to'plamlari";
        final String minutesPac = "\uD83D\uDD39DAQIQALAR  TO'PLAMI\uD83D\uDD39" +
                "\n\n➖➖➖➖➖➖➖" +
                "\n100 DAQIQA\nNarxi: 4 000 so'm\nKod: *111*1*3*1#\n" +
                "➖➖➖➖➖➖➖" +
                "\n300 DAQIQA\nNarxi: 10 000 so'm\nKod: *111*1*3*2#\n" +
                "➖➖➖➖➖➖➖" +
                "\n600 DAQIQA\nNarxi: 16 000 so'm\nKod: *111*1*3*3#\n" +
                "➖➖➖➖➖➖➖" +
                "\n1200 DAQIQA\nNarxi: 24 000 so'm\nKod: *111*1*3*4#\n" +
                "➖➖➖➖➖➖➖" +
                "\n\nPaketlarning amal qilish\nmuddati: 30 kun!";

        final String smsPac = "\uD83D\uDD39   SMS PAKETLARI   \uD83D\uDD39" +
                "\n\n➖➖➖➖➖➖➖" +
                "\n10 SMS\nNarxi: 420 so'm\nKod: *111*1*1*1#\n" +
                "➖➖➖➖➖➖➖" +
                "\n50 SMS\nNarxi: 1 680 so'm\nKod: *111*1*1*2#\n" +
                "➖➖➖➖➖➖➖" +
                "\n200 SMS\nNarxi: 5 200 so'm\nKod: *111*1*1*3#\n" +
                "➖➖➖➖➖➖➖" +
                "\n500 SMS\nNarxi: 9 500 so'm\nKod: *111*1*1*4#\n" +
                "➖➖➖➖➖➖➖" +
                "\n\nPaketlarning amal qilish\nmuddati: 30 kun!";

        final String ussdCodeText = "\uD83D\uDCF2         USSD KODLAR         \uD83D\uDCF2\n\n" +
                "➖➖➖➖➖➖➖➖➖➖➖➖\n" +
                "\uD83D\uDD39 Uzmobile operatori - 1099\n" +
                "➖➖➖➖➖➖➖➖➖➖➖➖\n" +
                "\uD83D\uDD39 Limit va balansni tekshirish - *107#\n" +
                "➖➖➖➖➖➖➖➖➖➖➖➖\n" +
                "\uD83D\uDD39 Hisobni boshqarish - *100#\n" +
                "➖➖➖➖➖➖➖➖➖➖➖➖\n" +
                "\uD83D\uDD39 Mening raqamim - *100*4#\n" +
                "➖➖➖➖➖➖➖➖➖➖➖➖\n" +
                "\uD83D\uDD39 Mening barcha raqamlarim - *100*5#\n" +
                "➖➖➖➖➖➖➖➖➖➖➖➖\n" +
                "\uD83D\uDD39 Trafik, minut, smslar\n       qoldig'ini ko'rish - *100*4#\n" +
                "➖➖➖➖➖➖➖➖➖➖➖➖\n" +
                "\uD83D\uDD39 4G LTE ni yoqish - *111*2*7*1#\n" +
                "➖➖➖➖➖➖➖➖➖➖➖➖\n" +
                "\uD83D\uDD39 4G LTE ni o'chirish - *111*2*7*2#\n" +
                "➖➖➖➖➖➖➖➖➖➖➖➖\n" +
                "\uD83D\uDD39 Kutib turishni faollashtirish - *43#\n";

        final String creatorText = "\uD83D\uDC68\uD83C\uDFFB\u200D\uD83D\uDCBB Dasturchiga yozish:\n          @IUTMNSH" +
                "\n\n\uD83D\uDCDE Tel: 91 657 44 32";
        final String dillerText = "⭐ Dillerga yozish:\n          @I7PUBET\n\n\uD83D\uDCDE Tel:  99 123 45 67" +
                "\n\n\uD83D\uDD08 Telegram kanali: https://t.me/ucell770";


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardRow1 = new KeyboardRow();


        //Keyboards
        KeyboardButton keyboardInternetPackage = new KeyboardButton();
        KeyboardButton keyboardTariff = new KeyboardButton();
        KeyboardButton keyboardMinutes = new KeyboardButton();
        KeyboardButton keyMonthPackage = new KeyboardButton();
        KeyboardButton keyDayPackage = new KeyboardButton();
        KeyboardButton keyNightPackage = new KeyboardButton();
        KeyboardButton keyNonStopPackage = new KeyboardButton();
        KeyboardButton keyBack = new KeyboardButton();
        KeyboardButton keyBoBtn00 = new KeyboardButton();
        KeyboardButton keyBoBtn01 = new KeyboardButton();
        KeyboardButton keyBoBtn02 = new KeyboardButton();
        KeyboardButton keyBoBtn10 = new KeyboardButton();
        KeyboardButton keyBoBtn11 = new KeyboardButton();
        KeyboardButton keyBoBtn12 = new KeyboardButton();
        KeyboardButton keyBoBtn20 = new KeyboardButton();
        KeyboardButton keyBoBtn21 = new KeyboardButton();
        KeyboardButton keyBoBtn22 = new KeyboardButton();
        KeyboardButton keyBoBtn30 = new KeyboardButton();
        KeyboardButton keyBoBtn31 = new KeyboardButton();


        SendMessage sendMessage = new SendMessage();


        //setKeyboard Text
        keyboardInternetPackage.setText(internetPackage);
        keyboardTariff.setText(tariffs);
        keyboardMinutes.setText(minutesSms);
        keyMonthPackage.setText(internetMonth);
        keyDayPackage.setText(internetDay);
        keyNightPackage.setText(internetNight);
        keyNonStopPackage.setText(internetNonStop);
        keyBack.setText(back);


        if (update.hasMessage()) {

            Message message = update.getMessage();

            if (message.hasText()) {
                String text = message.getText();


                System.out.println("Foydalanuvchi:"+message.getChatId());
                if (text.equals(start) | text.equals(back)) {
                    System.out.print("\n");
                    sendMessage.setText("Kerakli bo'limni tanlang: ");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(message.getChatId());

                    keyBoBtn20.setText(ussdCode);
                    keyBoBtn30.setText(creator);
                    keyBoBtn31.setText(diller);

                    keyboardRow1.add(keyboardInternetPackage);
                    keyboardRowList.add(keyboardRow1);

                    keyboardRow1 = new KeyboardRow();

                    keyboardRow1.add(keyboardTariff);
                    keyboardRow1.add(keyboardMinutes);
                    keyboardRowList.add(keyboardRow1);


                    keyboardRow1 = new KeyboardRow();

                    keyboardRow1.add(keyBoBtn20);
                    keyboardRow1.add(keyBoBtn30);
                    keyboardRowList.add(keyboardRow1);

                    keyboardRow1 = new KeyboardRow();

                    keyboardRow1.add(keyBoBtn31);
                    keyboardRowList.add(keyboardRow1);

                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                } else if (text.equals(internetPackage)) {
                    sendMessage.setText("Tanlang:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(message.getChatId());

                    keyboardRow1.add(keyMonthPackage);
                    keyboardRow1.add(keyDayPackage);
                    keyboardRowList.add(keyboardRow1);

                    keyboardRow1 = new KeyboardRow();

                    keyboardRow1.add(keyNightPackage);
                    keyboardRow1.add(keyNonStopPackage);
                    keyboardRowList.add(keyboardRow1);

                    keyboardRow1 = new KeyboardRow();

                    keyboardRow1.add(keyBack);

                    keyboardRowList.add(keyboardRow1);

                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                } else if (text.equals(internetMonth)) {
                    sendMessage.setText("Tanlang:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(message.getChatId());


                    keyBoBtn00.setText(packages[0]);
                    keyBoBtn01.setText(packages[1]);
                    keyBoBtn02.setText(packages[2]);
                    keyBoBtn10.setText(packages[3]);
                    keyBoBtn11.setText(packages[4]);
                    keyBoBtn12.setText(packages[5]);
                    keyBoBtn20.setText(packages[6]);
                    keyBoBtn21.setText(packages[7]);
                    keyBoBtn22.setText(packages[8]);
                    keyBoBtn30.setText(packages[9]);


                    keyboardRow1.add(keyBoBtn00);
                    keyboardRow1.add(keyBoBtn01);
                    keyboardRow1.add(keyBoBtn02);
                    keyboardRowList.add(keyboardRow1);

                    keyboardRow1 = new KeyboardRow();

                    keyboardRow1.add(keyBoBtn10);
                    keyboardRow1.add(keyBoBtn11);
                    keyboardRow1.add(keyBoBtn12);
                    keyboardRowList.add(keyboardRow1);

                    keyboardRow1 = new KeyboardRow();

                    keyboardRow1.add(keyBoBtn20);
                    keyboardRow1.add(keyBoBtn21);
                    keyboardRow1.add(keyBoBtn22);
                    keyboardRowList.add(keyboardRow1);

                    keyboardRow1 = new KeyboardRow();

                    keyboardRow1.add(keyBoBtn30);
                    keyboardRow1.add(keyBack);
                    keyboardRowList.add(keyboardRow1);

                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                } else if (text.equals(packages[0])) {
                    sendMessage.setText(package0);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(packages[1])) {
                    sendMessage.setText(package1);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(packages[2])) {
                    sendMessage.setText(package2);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(packages[3])) {
                    sendMessage.setText(package3);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(packages[4])) {
                    sendMessage.setText(package4);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(packages[5])) {
                    sendMessage.setText(package5);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(packages[6])) {
                    sendMessage.setText(package6);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(packages[7])) {
                    sendMessage.setText(package7);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(packages[8])) {
                    sendMessage.setText(package8);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(packages[9])) {
                    sendMessage.setText(package9);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(internetDay)) {
                    sendMessage.setText(packagesDay);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(internetNight)) {
                    sendMessage.setText(packagesNight);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(internetNonStop)) {
                    sendMessage.setText(packagesNonstop);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(tariffs)) {
                    sendMessage.setText("Tanlang:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(message.getChatId());

                    keyBoBtn00.setText(tariffStreet);
                    keyBoBtn01.setText(tariffStreetUp);
                    keyBoBtn02.setText(tariffOnlime);
                    keyBoBtn10.setText(tariffFlash);
                    keyBoBtn11.setText(tariffFlashUp);
                    keyBoBtn12.setText(tariffRoyal);
                    keyBoBtn20.setText(tariffOddiy10);
                    keyBoBtn21.setText(tariffTalim);
                    keyBoBtn22.setText(tariffIshbilarmon);

                    keyboardRow1.add(keyBoBtn00);
                    keyboardRow1.add(keyBoBtn01);
                    keyboardRow1.add(keyBoBtn02);
                    keyboardRowList.add(keyboardRow1);

                    keyboardRow1 = new KeyboardRow();

                    keyboardRow1.add(keyBoBtn10);
                    keyboardRow1.add(keyBoBtn11);
                    keyboardRow1.add(keyBoBtn12);
                    keyboardRowList.add(keyboardRow1);

                    keyboardRow1 = new KeyboardRow();

                    keyboardRow1.add(keyBoBtn20);
                    keyboardRow1.add(keyBoBtn21);
                    keyboardRow1.add(keyBoBtn22);
                    keyboardRowList.add(keyboardRow1);

                    keyboardRow1 = new KeyboardRow();

                    keyboardRow1.add(keyBack);
                    keyboardRowList.add(keyboardRow1);

                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                } else if (text.equals(tariffOddiy10)) {
                    sendMessage.setText(tariffTextOddiy10);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(tariffOnlime)) {
                    sendMessage.setText(tariffTextOnlime);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(tariffStreet)) {
                    sendMessage.setText(tariffTextStreet);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(tariffStreetUp)) {
                    sendMessage.setText(tariffTextStreetUp);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(tariffFlash)) {
                    sendMessage.setText(tariffTextFlash);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(tariffFlashUp)) {
                    sendMessage.setText(tariffTextFlashUp);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                }  else if (text.equals(tariffRoyal)) {
                    sendMessage.setText(tariffTextRoyal);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                }  else if (text.equals(tariffIshbilarmon)) {
                    sendMessage.setText(tariffTextIshbilarmon);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                }  else if (text.equals(tariffTalim)) {
                    sendMessage.setText(tariffTextTalim);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(minutesSms)) {
                    sendMessage.setText("Tanlang:");
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                    keyBoBtn00.setText(minutes);
                    keyBoBtn01.setText(sms);

                    keyboardRow1.add(keyBoBtn00);
                    keyboardRow1.add(keyBoBtn01);
                    keyboardRowList.add(keyboardRow1);

                    keyboardRow1 = new KeyboardRow();

                    keyboardRow1.add(keyBack);
                    keyboardRowList.add(keyboardRow1);

                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                } else if (text.equals(minutes)) {
                    sendMessage.setText(minutesPac);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(sms)) {
                    sendMessage.setText(smsPac);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(ussdCode)) {
                    sendMessage.setText(ussdCodeText);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                } else if (text.equals(creator)) {
                    sendMessage.setText(creatorText);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());


                } else if (text.equals(diller)) {
                    sendMessage.setText(dillerText);
                    sendMessage.setParseMode(ParseMode.HTML);
                    sendMessage.setChatId(message.getChatId());

                }else if (text.equals("/off")){
                    System.out.println("Foydalanuvchi chiqib ketdi!!!");
                }


                System.out.print(" -->> " + text);
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }


        }

    }

    public String getBotUsername() {
        return "uzmobilefast_bot";
    }

    public String getBotToken() {
        return "1232622811:AAEYr-RLY-yfc00ruOuF5Um2w9kSggeUbfY";
    }
}
