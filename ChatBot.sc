theme: /
    title: Корневая тема, АСОУП
    q: * (асоуп*|асауп*|осауп*|ас оуп|АСО УП|AСОУП|АСАУП|ОСАУП) *, fromState = /
    script: 
        sessionData.numberOfStep = 1;
        if (sessionData.dialogSteps) {sessionData.numberOfStep = sessionData.dialogSteps.length;}
#sessionData.botName=String(sessionData.botName);
#sessionData.botName=sessionData.botName.substring(0,sessionData.botName.search('---')) || "";
    if: sessionData.otzyv
        a: Выберите, пожалуйста, тему из предложенного списка или напишите текстом свой вопрос:
        
            &nbsp🔹 [Определить автоответ, передавший сообщение АСОУП]
            &nbsp🔹 Консультация по объекту: 
            &emsp;&emsp;&emsp;[Поезд]
            &emsp;&emsp;&emsp;[Вагон]
            &emsp;&emsp;&emsp;[Бригада]
            &emsp;&emsp;&emsp;[Локомотив]
            
            &nbsp;🔴 [В начало] 
            
            $otzyv 
    else:
        a: Выберите, пожалуйста, тему из предложенного списка или напишите текстом свой вопрос:
        
            &nbsp🔹 [Определить автоответ, передавший сообщение АСОУП]
            &nbsp🔹 Консультация по объекту: 
            &emsp;&emsp;&emsp;[Поезд]
            &emsp;&emsp;&emsp;[Вагон]
            &emsp;&emsp;&emsp;[Бригада]
            &emsp;&emsp;&emsp;[Локомотив]
            
            &nbsp;🔴 [В начало]
            
            <a href="http:\//zrw-ii-srv-01.zrw.oao.rzd/bot_presentation/start.aspx?sBot=$botName" target="_self" style="font-weight:bold;">Оставить отзыв</a>

