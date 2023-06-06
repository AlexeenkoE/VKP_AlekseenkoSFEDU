state: KVD
    title: сценарий по контролю норм веса и длины поезда
    q: * Консультация по КВД *,fromState = /
    q: * КВД *,fromState = /
    q: * Консультация по контролю норм веса и длины поезда(КВД) *,fromState = /
    q: * Проконсультировать по контролю норм веса и длины поезда(КВД) *,fromState = /
    q: * (Ошибка (562|O562|О562) *,fromState = /
    q: * {(превыш*|прев|ПРИВЫШ*|(лог*|снят*) контр*) * (колич*|кол-в*|длин*|макс*) вагон*} *,fromState = /
    q: * { (лог* контр*) * (ПPEB.KPИT.|превыш*|привыш*)} *,fromState = /
    q: * {(превыш*|прев|ПРИВЫШ*|ПPEB.KPИT.|лог* контр*|критическ*|критичес*|крит*|крет*) * (весов* норм*|норм* вес*|норм*|тон*|мас*|мвс*|услов* длин*|вес*|с толкач*|длин*|ВЕС) } *,fromState = /
    
    extend: /KVD/1
    go!: /KVD/MainMenuKVD
        
    state: 1 
        title: вызов табельного и обратно

        script:
            sessionData.Tab = "ГВЦ-01089";
            sessionData.TabRezerv = "ГВЦ-01089";
            sessionData.StepBefore = "/";
        extend: /getTabNum
        stepBack    
            
    state: wellcomContinuedDialogue
        title: Wellcom Continued dialogue
        a: Чем ещё могу помочь?   
    
    
    state: redirectToOperator
        title: tech redirectToOperator
        o:

   
    state: MainMenuKVD 
        title: Меню выбора дороги

        script:
            sessionData.templateName = "";
            sessionData.kodDor = "";
            sessionData.helpProviderOrNot == false;
            sessionData.ip = ""; 
            sessionData.description = "";
            sessionData.templateName = "";
            sessionData.assignee = "";
            sessionData.rzdKeRobot = "";
            sessionData.rzdEventCode = "";
            sessionData.EsppUser = "";
            sessionData.StepBefore = "/menuObjects/menuObjectsPoezd";
            sessionData.NumberOfTopic = "R14_take";
            sessionData.numberBot = 4;
            sessionData.resultInfoMail = "ivc-ISMurashova@skzd.rzd";
            sessionData.txtBlock="<script>document.getElementById('wa-qForm').style.visibility='hidden';</script>"; 
            sessionData.txtUnBlock="<script>document.getElementById('wa-qForm').style.visibility='visible'; </script>"; 
            sessionData.txtFocus="<script>document.querySelector('#wa-qForm > textarea').focus(); </script>";

            sessionData.rzdMTNKtnk = "";
            sessionData.rzdMTNKjob  = "";
            sessionData.idTnk = "";
            sessionData.idJob = "";
            sessionData.ssilka = "";
            sessionData.flagVerno = false;
            
        #Выберите дорогу для консультации \n по теме "КВД при **отправлении** груз.поезда":

        a: **Выберите дорогу** для консультации по **контролю норм веса и длины поезда**:
        
                * [**01 Октябрьская дорога**]
                * [**10 Калининградская дорога**]
                //* [**17 Московская дорога**]
                * [**24 Горьковская дорога**]
                * [**28 Северная дорога**]
                * [**51 Северо-Кавказская дорога**]
                * [**58 Юго-Восточная дорога**]
                * [**61 Приволжская дорога**]
                * [**63 Куйбышевская дорога**]
                * [**76 Свердловская дорога**]
                * [**80 Южно-Уральская дорога**]
                * [**83 Западно-Сибирская дорога**]
                * [**88 Красноярская дорога**]
                * [**92 Восточно-Сибирская дорога**]
                * [**94 Забайкальская дорога**]
                * [**96 Дальневосточная дорога**] 

    state: 2
        title: question_start
        q: * (51 Северо-Кавказская дорога|51|СКВ|Северо-Кавказская) *,fromState = /KVD/MainMenuKVD 
        q: * (17 Московская дорога|17|МСК|Московская) *,fromState = /KVD/MainMenuKVD 
        q: * (24 Горьковская дорога|Горьковская дорога|24) *,fromState = /KVD/MainMenuKVD
        q: * (01 Октябрьская дорога|Октябрьская дорога|01|1) *,fromState = /KVD/MainMenuKVD
        q: * (10 Калининградская дорога|Калининградская дорога|10) *,fromState = /KVD/MainMenuKVD
        q: * (92 Восточно-Сибирская дорога|Восточно-Сибирская дорога|92|ВСИБ) *,fromState = /KVD/MainMenuKVD 
        q: * (94 Забайкальская дорога|Забайкальская дорога|94|ЗАБ) *,fromState = /KVD/MainMenuKVD 
        q: * (96 Дальневосточная дорога|Дальневосточная дорога|96|ДВС) *,fromState = /KVD/MainMenuKVD 
        q: * (28 Северная дорога|Северная дорога|28) *,fromState = /KVD/MainMenuKVD
        q: * (80 Южно-Уральская дорога|Южно-Уральская|80|ЮУР) *,fromState = /KVD/MainMenuKVD
        q: * (83 Западно-Сибирская дорога|Западно-Сибирская|83|ЗСИБ) *,fromState = /KVD/MainMenuKVD
        q: * (88 Красноярская дорога|Красноярская|88|КРАСН) *,fromState = /KVD/MainMenuKVD
        q: * (63 Куйбышевская дорога|Куйбышевская|63|КБШ) *,fromState = /KVD/MainMenuKVD
        q: * (61 Приволжская дорога|Приволжская|61|ПРИВ) *,fromState = /KVD/MainMenuKVD
        q: * (58 Юго-Восточная дорога|Юго-Восточная|58|ЮВСТ) *,fromState = /KVD/MainMenuKVD 
        q: * (76 Свердловская дорога|Свердловская|76|СВРД) *,fromState = /KVD/MainMenuKVD

        if: parseTree && parseTree.text
            script:
                sessionData.lokDvT = 0;
                sessionData.lokPodt = 0;
                sessionData.serNumLokB = 0;
                sessionData.serNumLokC = 0;
                sessionData.serNumLokA = 0;
                sessionData.serNumLok_B_C = 0;
                sessionData.vidSled= "";
                sessionData.dor = parseTree.text || ''
            
                if(sessionData.dor == "51 северо-кавказская дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-ЮГ";
                    sessionData.kodDor = "51";
                    sessionData.ssilka = "http://10.51.5.38:9080/asoup2";}
                    
                if(sessionData.dor == "63 куйбышевская дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-ЮГ";
                    sessionData.kodDor = "63";
                    sessionData.ssilka = "http://10.246.110.148:9086/asoup2/";} 
                    
                if(sessionData.dor == "61 приволжская дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-ЮГ";
                    sessionData.kodDor = "61";
                    sessionData.ssilka = "http://pvrr-asoup2w-01.pvrr.oao.rzd:9080/asoup2/";}    
        
                if(sessionData.dor == "28 северная дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-ГОР-СЕВ";
                    sessionData.kodDor = "28";
                    sessionData.ssilka = "http://10.246.110.148:9088/ASOUP2/";} 
                    
                if(sessionData.dor == "01 октябрьская дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-ГОР-СЕВ";
                    sessionData.kodDor = "01";
                    sessionData.ssilka = "http://10.246.110.148:9081/ASOUP2/";}
                    
                if(sessionData.dor == "10 калининградская дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-ГОР-СЕВ";
                    sessionData.kodDor = "10";
                    sessionData.ssilka = "http://10.246.110.148:9084/asoup2/";}
                    
                if(sessionData.dor == "24 горьковская дорога" ){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-ГОР-СЕВ";
                    sessionData.kodDor = "24";
                    sessionData.ssilka = "http://10.246.110.148:9091/ASOUP2/";}
                    
                if(sessionData.dor == "96 дальневосточная дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-ВОСТ";
                    sessionData.kodDor = "96";
                    sessionData.ssilka = "http://web-asoup2-96.svrw.oao.rzd/asoup2";} 
                    
                if(sessionData.dor == "92 восточно-сибирская дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-ВОСТ";
                    sessionData.kodDor = "92";
                    sessionData.ssilka = "http://web-asoup2-92.svrw.oao.rzd/asoup2";} 
                    
                if(sessionData.dor == "94 забайкальская дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-ВОСТ";
                    sessionData.kodDor = "94";
                    sessionData.ssilka = "http://web-asoup2-94.svrw.oao.rzd/asoup2";}     
                    
                    
                if(sessionData.dor == "80 южно-уральская дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-УРАЛСИБ";
                    sessionData.kodDor = "80";
                    sessionData.ssilka = "http://web-asoup2-80.svrw.oao.rzd/asoup2";}
                    
                if(sessionData.dor == "83 западно-сибирская дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-УРАЛСИБ";
                    sessionData.kodDor = "83";
                    sessionData.ssilka = "http://web-asoup2-83.svrw.oao.rzd/asoup2";}
                    
                if(sessionData.dor == "88 красноярская дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-УРАЛСИБ";
                    sessionData.kodDor = "88";
                    sessionData.ssilka = "http://web-asoup2-88.svrw.oao.rzd/asoup2";}  
                    
                if(sessionData.dor == "58 юго-восточная дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-ЮГ";
                    sessionData.kodDor = "58";
                    sessionData.ssilka = "http://serw-asoup2w-01.msk.oao.rzd:9081/ASOUP2/";}
                
                if(sessionData.dor == "76 свердловская дорога"){
                    sessionData.templateName = "ЧАТ-БОТ-НСИ-КОНТРОЛЬ-ВЕСА-ДЛИНЫ-УРАЛСИБ";
                    sessionData.kodDor = "76";
                    sessionData.ssilka = "http://web-asoup2-76.svrw.oao.rzd/asoup2";}
                    
        
        #go!: /KVD/2/2.1        
        go!: /KVD/2/0
        
        state: 0
            title: start 
            a: Для проверки **перейдите в Web-ASOUP2** и проверьте **нормы**:\n
                1.По станции совершения операции, 
                2.По станции направления,
                3.По серии локомотива,
                4.По секционности локомотива.

                **Ссылке на Web-ASOUP2**:  $ssilka    
                  
                
                [Дальше]
            
                [Назад]
        
        state: 2.1
            title: index
            q: * Индекс поезда *, fromState = /KVD/2/2.6
            a: Введите индекс поезда в формате (**XXXX XXX XXXX**)
                  
                [Назад]
            script:
                sessionData.StepBefore = "/KVD/MainMenuKVD";
                
            
                
                                   
            state: 2.1-1
                title: получение индекс поезда
                q: *, fromState = /KVD/2/2.1
                script:
                    sessionData.train = parseTree.text || '';

                
                if: (/^[0-9]{4}\s\d{3}\s\d{4}$/g.test(sessionData.train) && sessionData.flagVerno == false)
                    go!: /KVD/2/2.2
                if: (/^[0-9]{4}\s\d{3}\s\d{4}$/g.test(sessionData.train) && sessionData.flagVerno == true)
                    go!: /KVD/2/2.6    
                else: 
                    a: Некорректно введен индексa поезда.\nНеобходимый формат цифр(**XXXX XXX XXXX**) 
                        
                        [Назад]
     
        state: 2.2
            title: станция совершения операции
            q: * Станция операции *, fromState = /KVD/2/2.6
            a: Введите станцию совершения операции в формате цифр(**XXXXXX**)
            
                [Назад]
            script:
                sessionData.StepBefore = "/KVD/2/2.1";    
            
            state: 2.2-1
                title: получение станции совершения операции
                q: *, fromState = /KVD/2/2.2                       
                script:
                    sessionData.sso = parseTree.text || '';

                if: (/^[0-9]{6}$/g.test(sessionData.sso) && sessionData.flagVerno == false)
                    go!: /KVD/2/2.3    
                
                if: (/^[0-9]{6}$/g.test(sessionData.sso) && sessionData.flagVerno == true)
                    go!: /KVD/2/2.6   
                else: 
                    a: Некорректно введена станция совершения операции.\n Необходимый формат (**XXXXXX**)
                    
                        [Назад]
                    
        state: 2.3
            title: станция направления операции
            q: * Направление следования *, fromState = /KVD/2/2.6
            a: Введите станцию направления следования в формате цифр(**XXXXXX**)     
                
                [Назад]
            script:
                sessionData.StepBefore = "/KVD/2/2.2"; 
                
            state: 2.3-1
                title: получение станции направления следования
                q: *, fromState = /KVD/2/2.3
                script:
                    sessionData.naprSled = parseTree.text || ''

                if: (/^[0-9]{6}$/g.test(sessionData.naprSled) && sessionData.flagVerno == false)
                    go!: /KVD/2/2.4  
                if: (/^[0-9]{6}$/g.test(sessionData.naprSled) && sessionData.flagVerno == true)
                    go!: /KVD/2/2.6     
                else: 
                    a: Некорректно ведена станция направления следования.\n Необходимый формат (**XXXXXX**)
                    
                        [Назад]
    
        state: 2.4
            title: серия и номер головного локомотива
            q: * Локомотив в голове *, fromState = /KVD/2/2.6
            a: Введите серию и номер локомотива в голове поезда в формате цифр: **XXX NNNN**\n (Например: 240 2109)
                
                [Назад]
            script:
                sessionData.StepBefore = "/KVD/2/2.3";
                
            state: 2.4-1
                title: vvodSerAndNumLok
                q: *, fromState = /KVD/2/2.4
                script:
                    sessionData.serNumLokA = parseTree.text || ''

                if: (/^[0-9]{3}\s\d{4}$/g.test(sessionData.serNumLokA) && sessionData.flagVerno == false)
                    go!: /KVD/2/2.5
                if: (/^[0-9]{3}\s\d{4}$/g.test(sessionData.serNumLokA) && sessionData.flagVerno == true)
                    go!: /KVD/2/2.6    
                    
                else: 
                    a: Некорректно введена серия и номер головного локомотива.\n Необходимый формат (**XXX NNNN**)
                        
                        [Назад]
                   
        state: 2.5
            title: есть ли еще локомотивы?
            script:
                sessionData.serNumLokA = parseTree.text || '';
                sessionData.serLokA = sessionData.serNumLokA.substring(0,3) || '';
                sessionData.numLokA = sessionData.serNumLokA.substring(3) || '';
            a: В поезде **есть дополнительный локомотив**?\n
                
                    * [локомотив в двойной тяге]
                                    
                    * [локомотив в подталкивании]
                                  
                    * [нет]
                [Назад]
            script:
                sessionData.StepBefore = "/KVD/2/2.4";    
                        
            state: 2.5-1
                title: есть локомотив в двойной тяге
                q: * локомотив в двойной тяге *,fromState = /KVD/2/2.5
                q: * Локомотив в двойной тяге *, fromState = /KVD/2/2.6
                a: Введите серию и номер локомотива в **двойной тяге** \n в формате цифр: **XXX NNNN**\n (Например: 240 2109)
                    
                    [Назад]
                script:
                    sessionData.StepBefore = "/KVD/2/2.5";
                
                state: 2.5-1.1
                    title: проверка ввода локомотива в двойной тяге
                    q: * ,fromState = /KVD/2/2.5/2.5-1
                    script:
                        sessionData.serNumLokB = parseTree.text || ''
                        sessionData.serNumLokC = "нет" ;
                        sessionData.lokDvT = sessionData.serNumLokB.substring(0,3) || '';
                        sessionData.numLokB = sessionData.serNumLokB.substring(3) || ''; 
                        sessionData.vidSled= "в двойной тяге";
                        sessionData.vidSl= "2";
                        sessionData.serNumLok_B_C = sessionData.serNumLokB;

                    if: (/^[0-9]{3}\s\d{4}$/g.test(sessionData.serNumLokB))
                        go!: /KVD/2/2.6
                    else: 
                        a: Некорректный формат ввода серии и номера локомотива $serNumLokB.\n Необходимый формат (**XXX NNNN**)
                            
                            [Назад]
                                
            state: 2.5-2
                title: есть локомотив в подталкивании
                q: * локомотив в подталкивании *, fromState = /KVD/2/2.5
                q: * Локомотив в подталкивании *, fromState = /KVD/2/2.6
                a: Введите серию и номер локомотива в **подталкивании** \n в формате цифр: **XXX NNNN**\n (Например: 240 2109)
                    
                    [Назад]
                script:
                    sessionData.StepBefore = "/KVD/2/2.5";
                    
                state: 2.5-2.1
                    title: проверка ввода локомотива в подталкивании
                    q: * , fromState = /KVD/2/2.5/2.5-2
                    script:
                        sessionData.serNumLokC = parseTree.text || ''
                        sessionData.serNumLokB = "нет" ;
                        sessionData.lokPodt = sessionData.serNumLokC.substring(0,3) || '';
                        sessionData.numLokС = sessionData.serNumLokC.substring(3) || '';
                        sessionData.vidSled= "в подталкивании";
                        sessionData.vidSl= "6";
                        sessionData.serNumLok_B_C = sessionData.serNumLokC;

                    if: (/^[0-9]{3}\s\d{4}$/g.test(sessionData.serNumLokC))
                        go!: /KVD/2/2.6
                                                            
                    else: 
                        a: Некорректный формат ввода серии и номера локомотива в подталкивании.\n Необходимый формат (**XXX NNNN**)
                        
                            [Назад]   
    
            state: 2.5-3
                title: нет локомотива
                q: * $not *, fromState = /KVD/2/2.5
                script:
                    sessionData.serNumLokB = "нет";
                    sessionData.serNumLokC = "нет";
                    sessionData.vidSled= "0";
                    sessionData.vidSl= "0";
                go!: /KVD/2/2.6
                                
          
        state: 2.6
            title: vivod
            script:
                    sessionData.flagVerno = true;
            a:  Я всё записал. Теперь давайте проверим.
                                
                [Индекс поезда :             ** $train **]
                [Станция операции :          ** $sso **]
                [Направление следования :    ** $naprSled **]
                [Локомотив в голове :        ** $serNumLokA **]
                [Локомотив в двойной тяге :  ** $serNumLokB **]
                [Локомотив в подталкивании : ** $serNumLokC **] 
    
                Всё верно? 
                
                * [Да] 
                
                * Нет, нажмите на не верное значение
                    
            state: verno
                title: verno
                q: * $agree *, fromState = /KVD/2/2.6
                if: sessionData.kodDor == "96"
                    go!: /KVD/2/2.8
                else:    
                    a: $txtBlock Пожалуйста, подождите, **до 5 минут**.\nЯ начал проверку норм.\n Обычно мне требуется **от 1 до 5 минут*.\nПожалуйста, не закрывайте наш диалог, так я справлюсь быстрее.
                # передача данных роботу, который по заданным параметрам от пользователя в Web-АСОУП2,Web-АOC
                # найдет локомотив и выберет нормы для данного локомотива
                    go!: /KVD/IntegrationMethodsRobotNorm
                                        
                    
            state: no_verno
                title: no_verno
                q: * $not *, fromState = /KVD/2/2.6
    
                channels: IVR
                    a: Скажите данные еще раз
                    go!: /KVD/2/2.1
                channels: default
                    a: Введите данные еще раз!
                    go!: /KVD/2/2.1
                                        
        state:  2.7
            title: вопросы после работы робота
            if: sessionData.prevL == "нет" &  sessionData.prevV == "нет"
                a: <align="center"> На основании собранной информации \n\n Ошибка возможна по причине <u>некорректно введенных данных</u>\n\n</align>
                    #justify
                    Показать как исправить?
                
                    * [Да]
                    * [Нет] - будет сформировано обращение в группу технологов.           
                        

            else:
                if: sessionData.kodDor == "96" || sessionData.kodDor == "61" || sessionData.kodDor == "01" || sessionData.kodDor == "10" || sessionData.kodDor == "24" || sessionData.kodDor == "80"
                    go!: /KVD/2/2.8
                else: 
                    a:    [Далее]
                    #go!: /KVD/2/2.8/2.8-2    
                
                
            state: 2.7-1    
                title: нет превышения
                q: * $agree *, fromState = /KVD/2/2.7
                if: sessionData.vidSl =="0"
                
                    a: **Проверьте в сообщении о готовности/отправлении показатели:**\n\n Направление: **$naprSled** \n 
                        <u>Локомотив **в голове $serNumLokA**</u>
                        Cерия и номер       
                        с признаком секции - $serNumLokA<strong><u><b><span style = "color:red">$prizSecA</span></b></u></strong>
                        Вид следования - <b><strong><u><SPAN STYLE="color:green"> 1 </SPAN></u></b></strong> \n
                
                           
                if: sessionData.vidSl !="0" 
                
                    a: **Проверьте в сообщении о готовности/отправлении показатели:**\n\n Направление: **$naprSled** \n 
                        
                        <u>Первый лок-в **в голове $serNumLokA**</u>
                        Cерия и номер       
                        с признаком секции - $serNumLokA<strong><u><b><span style = "color:red">$prizSecA</span></b></u></strong>
                        Вид следования - <b><strong><u><SPAN STYLE="color:green"> 1 </SPAN></u></b></strong> \n
                        
                        <u>Второй лок-в **$vidSled $serNumLok_B_C**</u>
                        Cерия и номер       
                        с признаком секции - $serNumLok_B_C<strong><u><b><span style = "color:red">$prizSecB_C</span></b></u></strong>
                        Вид следования - <b><strong><u><SPAN STYLE="color:green"> $vidSl </SPAN></u></b></strong> \n
                        
                      
                a:  <u>Проверьте <SPAN STYLE="color:red">**кол-во секций**</SPAN> и <SPAN STYLE="color:green">**вид след-ния**</SPAN></u>!
                    
                    Показатели в **Вашем сообщении* о готовности/отправлении **равны моим**?\n
                                        
                        * [Да]  - так и было в сообщении. Будет сформировано обращение в группу технологов.
                    
                        * [Нет] - нужно исправить.    
                    
                state: 2.7-1.1 
                    title: нормы не по приказу ЦТ
                    q: * $not *, fromState = /KVD/2/2.7/2.7-1
                    script:
                        sessionData.helpProviderOrNot = true;
                        sessionData.rzdMTNKtnk = "АСОУП ПМД. (ЧБ+Р) ЛК КВД. Нет превышения";
                        sessionData.rzdMTNKjob = "АСОУП ПМД. (ЧБ+Р) ЛК КВД. Нет превышения-чат-бот";
                        sessionData.idTnk = "145785";
                        sessionData.idJob = "165649";
                    a: Исправьте и введите сообщение о готовности повторно.
                    go!: /KVD/ResultWork
        
                        
                state: 2.7-1.2 
                    title: дальше может разобраться только технолог
                    q: * $agree *, fromState = /KVD/2/2.7/2.7-1
                    script:
                        sessionData.helpProviderOrNot = false;
                    #a: Создаю обращение на технолога! 
                    go!: /KVD/espp      
            
            state: 2.7-2 
                title: не хочу посмотреть показатели 
                q: * $not *, fromState = /KVD/2/2.7
                script:
                    sessionData.helpProviderOrNot = false;
                #a: Создаю обращение на технолога.
                go!: /KVD/ResultWork/choiceNotHelp
                    
        state: 2.8    
            title: есть превышения
            q: * Выдается превышения *, fromState = /KVD/2 
            q: * Дальше *, fromState = /KVD/2/0
            if: sessionData.kodDor == "51" || sessionData.kodDor == "28" || sessionData.kodDor == "94"
                go!: /KVD/2/2.8/2.8-2  
            else:
                a: У Вас есть **оперативный приказ** на отправление поезда, имеющего вес и длину свыше критических норм, установленных графиком движения поездов?
                    * [Да] 
                
                    * [Нет] 
                    
            state: 2.8-1
                title: приказ есть
                q: * $agree *, fromState = /KVD/2/2.8
                q: * {($sent|$exists|$ready) * [$order]} *, fromState = /KVD/2/2.8
                    
                a: Приказ отправлен по ЭПС технологу ИВЦ?
                    * [Да] - будет сформировано обращение в группу технологов.
                    
                    * [Нет] 
                    
    ##########приказ отправлен, но отправить поезд не получается, создание обращения на технолога#########
                state: 2.8-1.1
                    title: приказ отправлен технологу
                    q: * $agree *, fromState = /KVD/2/2.8/2.8-1
                    q: * {($action|$sent) * [$order]} *, fromState = /KVD/2/2.8/2.8-1
                    # сделать обращение сразу на технолога    
                    script:
                        sessionData.helpProviderOrNot = false;
                        sessionData.description = sessionData.kodDor +"  ЧАТ БОТ для консультации по теме контроля норм веса и длины поезда не оказана";
                    #a: Создаю обращение на технолога! 
                    go!: /KVD/espp 
                        
                state: 2.8-1.2
                    title: приказ не отправлен технологу
                    q: * $not *, fromState = /KVD/2/2.8/2.8-1
                    q: * {($not ($action|$sent)) * [$order]} *, fromState = /KVD/2/2.8/2.8-1
                    script:
  
                        if(sessionData.kodDor == "92"){
                            tempData.dispetcher = "Начальник смены ИВЦ <ivcks@esrr.rzd>";}    
                        if(sessionData.kodDor == "24"){
                            tempData.dispetcher = "АСОУП Диспетчер <ivc_disp4vcp@grw.rzd>";}
                        if(sessionData.kodDor == "01"){
                            tempData.dispetcher = "АСОУП Диспетчер <prikaz_spbivc@orw.rzd>;Копию выслать на Начальника смены СПб ИВЦ <AUR_Smena@orw.rzd>.";}
                        if(sessionData.kodDor == "63"){
                            tempData.dispetcher = "АСОУП Диспетчер <IVCPT-Oper@kbsh.rzd>";} 
                        if(sessionData.kodDor == "61"){
                            tempData.dispetcher = "АСОУП Диспетчер <smena@pvrr.rzd>";}     
                        if(sessionData.kodDor == "10"){
                            tempData.dispetcher = "АСОУП Диспетчер <ivcks@klgd.rzd>";} 
                        if(sessionData.kodDor == "80"){
                            tempData.dispetcher = "АСОУП Диспетчер <icc-yankovatv@surw.rzd>; <icc-udalova@surw.rzd>;<icc-cod80op3@surw.rzd>;<icc-smena@surw.rzd>.";}
                        if(sessionData.kodDor == "83"){
                            tempData.dispetcher = "АСОУП Диспетчер <ivcks@wsr.rzd>";}     
                        if(sessionData.kodDor == "88"){
                            tempData.dispetcher = "АСОУП Диспетчер <icc@krw.rzd>";}
                        if(sessionData.kodDor == "58"){
                            tempData.dispetcher = "АСОУП Диспетчер <IVCKS@serw.rzd>";}    
                        if(sessionData.kodDor == "76"){
                            tempData.dispetcher = "АСОУП Диспетчер <ivcks@svrw.rzd>;Дорожный диспетчер по грузовой работе<dgpgs@svrw.rzd>;Дежурный НОД-1 СВЖД<dnco1@svrw.rzd>.";}  
                        
                        if(sessionData.kodDor == "96"){
                            tempData.dispetcher = "АСОУП Диспетчер <ivc_dispasoup@dvgd.rzd>";
                            sessionData.rzdMTNKtnk = "АСОУП ПМД. (ЧБ) ЛК КВД. Необходимость временного ослабления ЛК (приказ не направлен в ИВЦ)";
                            sessionData.rzdMTNKjob = "АСОУП ПМД. (ЧБ) ЛК КВД. Необходимость временного ослабления ЛК (приказ не направлен в ИВЦ)-чат-бот";
                            sessionData.idTnk = "123765";
                            sessionData.idJob = "141988";}
                        else{
                            sessionData.rzdMTNKtnk = "АСОУП ПМД. (ЧБ+Р) ЛК КВД. Есть превышение";
                            sessionData.rzdMTNKjob = "АСОУП ПМД. (ЧБ+Р) ЛК КВД. Есть превышение-чат-бот";
                            sessionData.idTnk = "145760";
                            sessionData.idJob = "165623";}
    
                    a: Корректировка возможна только при наличии оперативного приказа. Отправьте приказ диспетчеру АСОУП. $dispetcher
    
                    go!: /KVD/ResultWork 
                
    ##############куда отправиться за приказом###########
            state: 2.8-2
                title: нет приказа
                q: * $not *, fromState = /KVD/2/2.8 
                q: * Далее *, fromState = /KVD/2/2.7 
                q: * {($not ($sent|$exists|$ready)) * [$order]} *, fromState = /KVD/2/2.8
                script:
                    sessionData.helpProviderOrNot  = false;
                    if(sessionData.kodDor == "96"){
                        sessionData.prTonn = "";
                        sessionData.prVag = "";
                        sessionData.prevV = "";
                        sessionData.prevL = "";
                        tempData.phonD = "РЕГ-1 (0988 55) 4-78-75;\n РЕГ-3 (0988 55) 4-78-76;\n РЕГ-4 (0988 55) 4-79-77;\n РЕГ-6 (0988 55) 4-78-97.";
                        
                        sessionData.rzdMTNKtnk = "АСОУП ПМД. (ЧБ) ЛК КВД. Необходимость временного ослабления ЛК (приказ отсутствует)";
                        sessionData.rzdMTNKjob = "АСОУП ПМД. (ЧБ) ЛК КВД. Необходимость временного ослабления ЛК (приказ отсутствует)-чат-бот";
                        sessionData.idTnk = "123766";
                        sessionData.idJob = "141990";}   
                    else{
                        sessionData.rzdMTNKtnk = "АСОУП ПМД. (ЧБ+Р) ЛК КВД. Есть превышение";
                        sessionData.rzdMTNKjob = "АСОУП ПМД. (ЧБ+Р) ЛК КВД. Есть превышение-чат-бот";
                        sessionData.idTnk = "145760";
                        sessionData.idJob = "165623";}  
                    
                    if(sessionData.kodDor == "24"){   
                        tempData.phonD = "(0916 35) 2-49-01";}
                    if(sessionData.kodDor == "51"){   
                        tempData.phonD = "(0950 25) 3-25-32;\n(0950 25)5-11-39."}  
                    if(sessionData.kodDor == "80"){   
                        tempData.phonD = "(0972 41) 4-30-54."} 
                    if(sessionData.kodDor == "88"){   
                        tempData.phonD = "телефон ДГС (0990) 4-40-01."}     
                    if(sessionData.kodDor == "28"){   
                        tempData.phonD = "к ДНЦ своего участка."} 
                    if(sessionData.kodDor == "63"){   
                        tempData.phonD = "(0960-38) 2-04-12"}     
                    if(sessionData.kodDor == "94"){   
                        tempData.phonD = "(0994-52) 2-55-07."}
                    if(sessionData.kodDor == "92"){   
                        tempData.phonD = "(0992-46) 4-57-17 - старший Диспетчер ДГП"} 
                    if(sessionData.kodDor == "61"){   
                        tempData.phonD = "(0964-29) 4-40-31 - оператор при ДГПС"} 
                    if(sessionData.kodDor == "10"){   
                        tempData.phonD = "(0934)47-697 - КЛНГ Д Грузовой диспетчер"}  
                    if(sessionData.kodDor == "01"){   
                        tempData.phonD = "(0912-10)28-528 - Дежурный по дороге"} 
                    if(sessionData.kodDor == "83" || sessionData.kodDor == "76"){   
                        tempData.phonD = "к поездному диспетчеру своего региона"}
                    if(sessionData.kodDor == "58"){   
                        tempData.phonD = "0(918)5-49-01 - Диспетчер ДГП"} 
                        
                    if(sessionData.prevL =="нет" || sessionData.prevL ==""){
                    sessionData.prVag = "";
                    }else{
                        sessionData.prVag = sessionData.prevL +" вагонов.";}
                    
                    if(sessionData.prevV =="нет" || sessionData.prevV ==""){
                        sessionData.prTonn = "";
                    }else{
                        sessionData.prTonn = sessionData.prevV +" тонн.";} 
                        
                     
                        
                #a: Для **отправления поезда**, имеющего вес и длину свыше унифицированных норм, необходимо выбрать один из вариантов  действия :\n 1. Уменьшение веса/длины поезда(**отцепка вагонов от поезда $prTonn/$prVag**)\n 2. Отправление поезда **более мощным локомотивом** (без изменения веса/длины поезда)\n 3. Получить в службе **оперативный приказ** на отправление поезда с превышением критических норм по телефону:\n <align="center">**$phonD**</align> 
                
                a: Для **отправления поезда**, имеющего вес и длину свыше критических и максимальных норм веса и длины, необходимо выбрать один из вариантов  действия :\n 1. Уменьшение веса/длины поезда\n 2. Отправление поезда **более мощным локомотивом** (без изменения веса/длины поезда)\n 3. Получить **оперативный приказ** на отправление поезда с превышением критических норм по телефону:\n <align="center">**$phonD**</align> 
                
                go!: /KVD/ResultWork 
                
    
########ВЫЗОВ МЕТОДА РАБОТЫ РОБОТА и ОБРАБОТКА РЕЗУЛЬТАТА##########################################   
    state: IntegrationMethodsRobotNorm
        title: IntegrationMethodsRobot
        script:
            tempData.id = Math.floor(Math.random() * Date.now());
            tempData.norm = "";
            tempData.errorCallRobot = "";
            sessionData.message_in = "";
            sessionData.inChat = "";
            tempData.i = 0;
            sessionData.start= "";
            sessionData.prizSecB_C="";
            sessionData.prevV= "";
            sessionData.countVag = "";
            sessionData.maxLength = "";
            sessionData.kritVes = "";
            sessionData.inChat = "";
            sessionData.in = "";
            sessionData.inPrint = "";
            sessionData.secLokA = "";
            sessionData.secLok_B_C = "";
            sessionData.prevL = "";
            sessionData.prizSecB_C="";
            sessionData.prizSecA=""; 
            sessionData.notlok = false;
        externalCall: callingIntegrationRPA        
            id = $id
            request = $sso+$naprSled+$serNumLokA+$serNumLokB+$serNumLokC+$kodDor+$train;
            NumberOfTopic = $NumberOfTopic
            ifSuccess:
                script:
                    if(eaResult && eaResult.tempMessage){
                    sessionData.st= false;
                    sessionData.message_in = eaResult.tempMessage;
                    sessionData.inChatPrint =  sessionData.message_in.split(";");  
                  
                    sessionData.start =sessionData.inChatPrint[0];
                        if(sessionData.start == "Выберете нормы")
                        {
                        sessionData.inChat =  sessionData.message_in.split(",");
                        sessionData.in =  sessionData.inChat[0];
                        sessionData.inPrint =  sessionData.in.replace(/\;/g, "\r\n");
                        sessionData.secLokA =sessionData.inChat[1];
                        sessionData.secLok_B_C =sessionData.inChat[2];
                        }
                        if(sessionData.start != "Выберете нормы")
                        {
                        sessionData.vesPoezd =sessionData.inChatPrint[1];
                        sessionData.kritVes =sessionData.inChatPrint[2];
                        sessionData.prevV =sessionData.inChatPrint[3];
    
                        sessionData.countVag =sessionData.inChatPrint[4];
                        sessionData.maxLength =sessionData.inChatPrint[5];
                        sessionData.prevL =sessionData.inChatPrint[6];
                        sessionData.secLokA =sessionData.inChatPrint[7];
                        sessionData.secLok_B_C =sessionData.inChatPrint[8];
                        }
                        
                        
                        if(sessionData.secLok_B_C=="1" || sessionData.secLok_B_C=="2" || sessionData.secLok_B_C=="3")
                        {
                        sessionData.prizSecB_C=sessionData.secLok_B_C-1;
                        }
                        
                        if(sessionData.secLok_B_C=="4")
                        {
                        sessionData.prizSecB_C="2";
                        }
                        
                        if(sessionData.secLokA=="1" || sessionData.secLokA=="2" || sessionData.secLokA=="3")
                        {
                        sessionData.prizSecA=sessionData.secLokA-1;
                        }
                        
                        if(sessionData.secLokA=="4")
                        {
                        sessionData.prizSecA="2";
                        }
                        
                    }else{
                        tempData.errorCallRobot = "Cервису взаимодействия с RPA отработал, но вернул ошибку"  + "Ip:" + sessionData.ip;
                        if(eaResult.tempMessage){
                            tempData.errorCallRobot += " " + eaResult.tempMessage;
                        }else{
                                ;}
                        sessionData.description += tempData.errorCallRobot;
                        }  
                        
                if: sessionData.message_in =="Данных нет ИП"  
                    script:
                        sessionData.helpProviderOrNot = false;
                        sessionData.description = sessionData.kodDor +"  ЧАТ БОТ для консультации по теме контроля норм веса и длины поезда не оказана";
                    a:  $txtUnBlock Индекс поезда **$train** в НСИ не найден.\nСоздаю обращение в рабочую группу технолога.$txtFocus
                    go!: /KVD/espp 
                
                if: sessionData.message_in =="Доступа нет"
                    script:
                        sessionData.helpProviderOrNot = false;
                        sessionData.description = sessionData.kodDor +"  ЧАТ БОТ для консультации по теме контроля норм веса и длины поезда не оказана";
                    a:  $txtUnBlock Сервис работы с роботом недоступен. Нет доступа к АРМ АСОУП2.\n\n Вы можете посмотреть нормы КВД по Вашей станции **$sso** в АРМ АСОУП2.\n\n Запросить справку:\n (:214 КПЗ 3023:серия **XXX** номер локомотива **XXXX**:) для уточнения кол-ва секций.$txtFocus
                    go!: /KVD/espp 
                
                
                
                if: sessionData.vesPoezd =="Нет данных."  
                    script:
                        sessionData.helpProviderOrNot = false;
                        sessionData.description = sessionData.kodDor +"  ЧАТ БОТ для консультации по теме контроля норм веса и длины поезда не оказана";
                    a:  $txtUnBlock ВНИМАНИЕ! На участке **$sso** - **$naprSled** в НСИ АСОУП нормы не найдены.\nСоздаю обращение в рабочую группу технолога.$txtFocus
                    go!: /KVD/espp 
                        
                 
                    
                if: sessionData.message_in =="Нет опорной станции совершения операции"
                    script:
                        sessionData.helpProviderOrNot = false;
                        sessionData.description = sessionData.kodDor +"  ЧАТ БОТ для консультации по теме контроля норм веса и длины поезда не оказана";
                    a:  $txtUnBlock Cтанции **$sso** нет в НСИ списке опорных станций совершения операции.\nСоздаю обращение в группу технологу.$txtFocus
                    go!: /KVD/espp      
                    
                if: sessionData.start =="2 нет"
                    script:
                        sessionData.vidSl= "6";
                        sessionData.vidSled="в подталкивании"; 
                    a:  $txtUnBlock ВНИМАНИЕ!!! В нормах НСИ нет серии лок-ва **$lokDvT в двойной тяге.**\n Но существует серия лок-в **$lokDvT в подталкивании**.\n\n Станция **$sso** \nНапр.: **$naprSled** \n Лок-в **$serNumLokA* вид следования **в голове**\n Лок-в **$serNumLok_B_C* вид следования **в подталкивании**:\n\n Вес поезда ($train) : **$vesPoezd**  тонн.\n Крит.масса: **$kritVes**. \nПревышения по весу - **$prevV (тонн).** \n\n Длина поезда ($train): **$countVag** вагонов.\nМакс.длина: **$maxLength** \nПревышения по длине - **$prevL (вагонов).** $txtFocus 
                    go!: /KVD/2/2.7 
                        
                if: sessionData.start =="подталкивания нет"
                    script:
                        sessionData.vidSl= "2";
                        sessionData.vidSled="в двойной тяге";    
                    a:  $txtUnBlock ВНИМАНИЕ!!! В нормах НСИ **нет серии лок-ва $lokPodt в подталкивании.**\n Но существует серия лок-ва **$lokPodt в двойной тяге**.\n\n Станция **$sso** \nНапр.: **$naprSled** \n Лок-в **$serNumLokA* вид следования **в голове**\n Лок-в **$serNumLok_B_C* вид следования **в двойной тяге**:\n\n Вес поезда ($train) : **$vesPoezd**  тонн.\n Крит.масса: **$kritVes**.\nПревышения по весу - **$prevV (тонн).** \n\n Длина поезда ($train): **$countVag** вагонов.\nМакс.длина: **$maxLength** \nПревышения по длине - **$prevL (вагонов).** $txtFocus 
                    go!: /KVD/2/2.7 
                       
                if: sessionData.start =="нет локомотива"
                    script:
                        sessionData.vidSl= "0";
                        sessionData.vidSled=""; 
                        sessionData.notlok=true;
                    a:  $txtUnBlock Станция **$sso** \nНапр.: **$naprSled** \n Лок-в **$serNumLokA* вид следования **в голове**\n\n Вес поезда ($train) : **$vesPoezd**  тонн.\n Крит.масса: **$kritVes**.\nПревышения по весу - **$prevV (тонн).** \n\n Длина поезда ($train): **$countVag** вагонов.\nМакс.длина: **$maxLength** \nПревышения по длине - **$prevL (вагонов).**  $txtFocus
                    go!: /KVD/2/2.7 
                    
                if: sessionData.start =="Выберете нормы" 
                    if: sessionData.vidSled =="0"
                        a:  $txtUnBlock Нормы веса и длины по станции **$sso** \nЛок-в **$serNumLokA* вид следования **в голове**\n $inPrint $txtFocus
                        go!: /KVD/2/2.7/2.7-2
                    else: 
                        a:  $txtUnBlock Нормы веса и длины по станции **$sso** \n Лок-в **$serNumLokA* вид следования **в голове**\n Лок-в **$serNumLok_B_C* вид следования **$vidSled**:\n\n $inPrint $txtFocus
                        go!: /KVD/2/2.7/2.7-2
    
                if: sessionData.vidSled =="0"
                    script:
                        sessionData.vidSl= "0";
                    a:  $txtUnBlock Станция **$sso** \nНапр.: **$naprSled** \n Лок-в **$serNumLokA* вид следования **в голове**\n\n Вес поезда ($train) : **$vesPoezd**  тонн.\n Крит.масса: **$kritVes**.\nПревышения по весу - **$prevV (тонн).** \n\n Длина поезда ($train): **$countVag** вагонов.\n Макс.длина: **$maxLength**.\nПревышения по длине - **$prevL (вагонов).** $txtFocus
                    go!: /KVD/2/2.7
                
                
                if: sessionData.message_in
                    script:
                        sessionData.st = true;
                    a:  $txtUnBlock Cтанция: **$sso** \nНаправление: **$naprSled** \n Лок-в **$serNumLokA* вид следования **в голове**\n Лок-в **$serNumLok_B_C* вид следования **$vidSled**:\n\n Вес поезда ($train) : **$vesPoezd**  тонн.\n Крит.масса: **$kritVes**.\nПревышения по весу - **$prevV (тонн).** \n\n Длина поезда ($train): **$countVag** вагонов.\nМакс.длина: **$maxLength**. \nПревышения по длине - **$prevL (вагонов).** $txtFocus
                    go!: /KVD/2/2.7    
                
            ifFail:
                script:
                    tempData.errorCallRobot = "\n Ошибка обращения к сервису взаимодействия с RPA";
                    sessionData.description += tempData.errorCallRobot;
                    sessionData.helpProviderOrNot = false;
                a:  $txtUnBlock Сервис работы с роботом недоступен.\n\n Вы можете посмотреть нормы КВД по Вашей станции **$sso** в АРМ АСОУП2.\n\n Запросить справку:\n (:214 КПЗ 3023:серия **XXX** номер локомотива **XXXX**:) для уточнения кол-во секций. $txtFocus
                go!: /KVD/ResultWork/DialogConsentNoServis
        
###############опрос работы ЧБ###############################
    state: ResultWork
        title: результат работы ЧБ
        a: Помог ли Вам чат бот?
                ✅ [Да] \n
                🆘 [Нет] \n
                🔴 [В начало] \n
                $otzyv
        # осуществляем переход в стейт espp
        # по флагу sessionData.help = True создаем и закрываем обращение
        state: choiceHelp
            title: choiceHelp
            q: * Да *, fromState = /KVD/ResultWork
            #q: * помог *, fromState = /KVD/ResultWork
            script:
                    sessionData.helpProviderOrNot = true;
                    sessionData.description = sessionData.kodDor +"  ЧАТ БОТ для консультации по теме контроля норм веса и длины поезда оказана";
        # осуществляем переход в стейт espp
            go!: /KVD/espp 
            
        # по метке sessionData.successfulSession создаем обращение на технолога
        state: choiceNotHelp
            title: choiceNotHelp
            #q: * {(не помог) * обращен* [$oneWord] ЕСПП [технолог*]} *, fromState = /KVD/ResultWork
            q: * Нет *, fromState = /KVD/ResultWork
            script:
                    sessionData.helpProviderOrNot = false; 
                    sessionData.description = sessionData.kodDor +"  ЧАТ БОТ для консультации по теме контроля норм веса и длины поезда не оказана";
            go!: /KVD/espp 
            
        state: DialogConsentNoServis
            title: нет ответа от внешнего сервиса
            script:
                sessionData.description = "";
            if: sessionData.helpProviderOrNot == false
                script:
                    sessionData.description = sessionData.kodDor +"  ЧАТ БОТ для консультации по теме контроля норм веса и длины поезда - НЕТ ОТВЕТА ОТ ВНЕШНЕГО СЕРВИСА";
            
            go!: /KVD/espp 
            
    state: espp
        title: параметры ЕСПП
        if: sessionData.kodDor == "96"
            script:
                sessionData.EsppUser = "Autobot-ASOUP-NSI-KVD"
                sessionData.EsppPassword = "123456789"
                sessionData.assignee = "ЧАТ БОТ АСОУП-НСИ-КВД (AUTOBOT-ASOUP-NSI-KVD)"
                sessionData.rzdEventCode =  "ИИ-ЦТС-КСУП-0003"
                sessionData.rzdKeRobot =  "ИИ-ЦРТ-АСОУП-НСИ-КВД-ТС-0001-ОБЩЕЕ"
                if (sessionData.helpProviderOrNot == false){
                sessionData.description = "<ЧБП> "+ "96  ЧАТ БОТ для консультации по теме контроля норм веса и длины поезда оказана";}
                sessionData.briefDescription = sessionData.description
        else: 
            script:
                sessionData.EsppUser = "Autobot-ASOUP-NSI-KVD-2"
                sessionData.EsppPassword = "123456789"
                sessionData.assignee = "ЧАТ БОТ АСОУП-НСИ-КВД-2 (AUTOBOT-ASOUP-NSI-KVD-2)"
                sessionData.rzdEventCode =  "КСУП-ИИ-0015"
                sessionData.rzdKeRobot =  "ИИ-ЦРТ-АСОУП-НСИ-КВД-2-ТС-0001-ОБЩЕЕ"
                sessionData.briefDescription = sessionData.description
        a: $txtBlockПожалуйста, подождите...        
        go!: /callingTheMethodEspp  
        
        
