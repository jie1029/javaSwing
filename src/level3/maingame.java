package level3;

public class maingame{
public final static int nodoing = -1;
public final static int ending =0;
//���� �ൿ 1��
public final static int feed =1;
public final static int punish =2;
public final static int pet =3;
public final static int syringe =4;
//����ũ ���� �����ൿ 4��
public final static int feed_trash =5;
public final static int punish_harder =6;
public final static int read_story =7;
public final static int hard_training = 8;
//����ũ �ִ� �����ൿ 4��
public final static int special_doctor =9;
public final static int special_farmer =10;
public final static int special_soldier =11;
public final static int special_mentalist =12;
//������ ���� �ٸ� Ư���ൿ
//�������̽��κ��� �ൿ�����Ҷ��� �Է¹���
public final static int pranc =1;
public final static int vamp = 2;
public final static int zombie =3;
//�������̽��κ��� �Է¹���
public final static int doctor =1;
public final static int soldier =2;
public final static int mentalist =3;
public final static int farmer = 4;
//�������̽��� ���� �Է¹���
//�������̽��� ���� ó������ �Է¹���
public final static int still_ok = 0;
public final static int bad_ending_hunger_pranc =1;
public final static int bad_ending_health_pranc =2;
public final static int bad_ending_mental_pranc =3;
public final static int bad_ending_obedience_pranc =4;
public final static int bad_ending_hunger_vamp =5;
public final static int bad_ending_health_vamp =6;
public final static int bad_ending_mental_vamp =7;
public final static int bad_ending_obedience_vamp =8;
public final static int bad_ending_hunger_zombie =9;
public final static int bad_ending_health_zombie =10;
public final static int bad_ending_mental_zombie =11;
public final static int bad_ending_obedience_zombie =12;
//0�̵� ���ȿ� ���� �ٸ������� �����ؾ��� ����ü Ÿ�Ե� üũ ����
public final static int clear_ending_pranc =13;
public final static int clear_ending_vamp = 14;
public final static int clear_ending_zombie = 15;

public final static int bad_over_ending  =16;
//����ü Ÿ�Կ� ���� �ٸ� ���Ϲ߷�
public final static int first_pranc_hunger =20;
public final static int first_pranc_health = 25;
public final static int first_pranc_mental = 40;
public final static int first_pranc_obedience = 35;
public final static int first_vamp_hunger =30;
public final static int first_vamp_health = 20;
public final static int first_vamp_mental = 30;
public final static int first_vamp_obedience  =40;
public final static int first_zombie_hunger =40;
public final static int first_zombie_health =25;
public final static int first_zombie_mental = 20;
public final static int first_zombie_obedience = 30;
//����ü�� ���� �ʱ⽺�ȵ�



public static int decrease_hunger_pranc = 4;
public static int decrease_health_pranc = 3;
public static int decrease_mental_pranc = 6;
public static int decrease_obedience_pranc = 5;
public static int decrease_hunger_vamp =4;
public static int decrease_health_vamp =2;
public static int decrease_mental_vamp =4;
public static int decrease_obedience_vamp =8;
public static int decrease_hunger_zombie = 7;
public static int decrease_health_zombie = 3;
public static int decrease_mental_zombie =2;
public static int decrease_obedience_zombie = 4;

public static float passive_rate = 4/5;

public static String event_name_1 = "������ �湮!!!";
public static String event_text_1 = "�Ű� ���� ������ �湮�ߴ�!!! ������ ���ϰ��ΰ�???";
public static String event_result_yes_1 = "������ �׿��� �ڱ��� ���� ����ü�� �� ����������...";
public static String event_result_no_1 = "������ �����־����� ������ �˾Ƽ� �������...";
public static final int event_index_1 = 0;
public static String event_name_2 = "������ ������ �湮!!!";
public static String event_text_2 = "������ ������ �Ѱ��� �̻��غ��̴� ������ �Ǵ�!!! �����Ұ��ΰ�???";
public static String event_result_yes_2 = "������ ������ �����ϰ� ����� ������ �����״�...";
public static String event_result_no_2 = "������ ������ �ƽ���� �λ��� ���� �������...";
public static final int event_index_2 = 1;
public static String event_name_3 = "����ü�� �ݶ�!!!";
public static String event_text_3 = "������ü�� ���ڱ� ��û���� ������ �Ѵ�!!! ������ ��ġ�� ���Ұ��ΰ�???";
public static String event_result_yes_3 = "������ ��ġ�� ���ߴ��� ������ ������ �ż�����...";
public static String event_result_no_3 = "������ �״��� ȥ�� ���ļ� ����������...";
public static final int event_index_3 = 2;
public static String event_name_4 = "���ڱ� ���� ������!!!";
public static String event_text_4 = "���� ���ڱ� ������!!! �̽�½�� ������ �������ΰ�???";
public static String event_result_yes_4 = "�̽�½�� �����̾����� ȿ���� �����̾���!!!";
public static String event_result_no_4 = "���� �������� ����ü�� �������� ���� �����ߴ�...";
public static final int event_index_4 = 3;
public static String event_name_5 = "�������� �ΰ���!!!";
public static String event_text_5 = "�������� �ΰ����� �ִ�!!! ���̷� ��� �޽��Ұ��ΰ�???";
public static String event_result_yes_5 = "�˰��� ������ ���� ����̾ ���� ���ϰ� ������� �ߴ�...";
public static String event_result_no_5 = "����ü�� �ΰ���⸦ ���Ծ� ��Ⱑ ���� �����ߴ�...";
public static final int event_index_5 =4;
public static String event_name_6  = "�߻������� Ż��!!!";
public static String event_text_6 = "���������� ǻ���� Ż���ؼ� ������ü�� �޽��ߴ�!!! ������ü�� ������ �� ���ΰ�???";
public static String event_result_yes_6 ="������ �ߴ��� ������ü�� �������ȴ�...";
public static String event_result_no_6 = "������ü�� �����༭ ���� ǻ���� �����ƴ��� ������ü�� �������� ���� �����ߴ�!!!";
public static final int event_index_6 =5;
public static String event_name_7  = "����½�� �̿�!!!";
public static String event_text_7 = "����½�� �̿��� �̻�Դٸ鼭 ������� ���ȿ� ������ �Ѵ�!!! �����°��� ����� ���ΰ�??? ";
public static String event_result_yes_7 ="���ٴϴ� ȥ��... �Ͼ˶� �����̾ ����ü�� ������ ������â�� �ǹ��ȴ�...";
public static String event_result_no_7 = "������ �����̶�� ������ ���� �ְ� ����!!!";
public static final int event_index_7 =6;

/*
public static String event_name_8  = "";
public static String event_text_8 = "";
public static String event_result_yes_8 ="";
public static String event_result_no_8 = "";
public static final int event_index_8 = ;
*/
public static final int event_num =7;
public static final int ending_num =17;


public static final int yes = 0;
public static final int no =1;
creature my_creature;
no_job my_job;
event my_event;
String []ending_text_table = new String [ending_num];
event_vew vew;
//init�� �� ȣ���ؼ� �ڽ��� ����ü�� �ڽ��� ������ �ʱ�ȭ��
return_value r_v ;
class event_element
{
    String name;
    String text;
    String result_yes;
    String result_no;
    public event_element(String a, String b,String c, String d)
    {
        this.name =a;
        this.text = b;
        this.result_yes = c;
        this.result_no =d;
    }
}
//�������̽����� ������ �߷���
public event_vew event_occur()
{
   /* int occur_or_not = 50;
    if(occur_or_not<(int)Math.random()*100)
    {
        return new event_element("�ƹ��ϵ� ����.","��ҿ� ����..."," "," ");
        //�̺�Ʈ �߻�����
    }*/
	int temp_index;
    temp_index = (int)(Math.random()*event_num);
    /*return temp_index;*/
    return new event_vew(my_event.event_table[temp_index].name,my_event.event_table[temp_index].text,temp_index);

}
public return_value_event event_choice(int a, int temp_index) //0�� �� 1�� �ƴϿ�
{
    if(temp_index != -1 && temp_index <event_num)
    {
        switch(a)
        {
            case yes:
                switch(temp_index)
                {
                    case event_index_1:
                        my_creature.obedience *= (float)3/5;
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_yes_1);
                    case event_index_2:
                        my_creature.health *= (float)1/2;
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_yes_2);
                    case event_index_3:
                        my_creature.obedience *= (float)6/7;
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_yes_3);
                    case event_index_4:
                        my_creature.mental *=(float)6/5;
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_yes_4);
                    case event_index_5:
                        my_creature.obedience *=(float)1/2;
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_yes_5);
                    case event_index_6:
                        my_creature.mental*=(float)6/7;
                        my_creature.obedience *=(float)6/7;
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_yes_6);
                    case event_index_7:
                        int temp_hunger = my_creature.hunger;
                        int temp_health = my_creature.health;
                        int temp_mental = my_creature.mental;
                        int temp_obedience = my_creature.obedience;
                        int total_num;
                        total_num = (int)(Math.random()*10) +1;
                        for(int i=0;i<total_num;i++)
                        {
                            int temp_num = (int)(Math.random())*5;
                            switch(temp_num)
                            {
                                case 0:
                                    my_creature.hunger = my_creature.health;
                                    my_creature.health = temp_hunger;
                                    break;
                                case 1:
                                    my_creature.obedience = my_creature.mental;
                                    my_creature.mental = temp_obedience;
                                    break;
                                case 2:
                                    my_creature.mental = my_creature.hunger;
                                    my_creature.hunger = temp_mental;
                                    break;
                                case 3:
                                    my_creature.health = my_creature.obedience;
                                    my_creature.obedience = temp_health;
                                    break;
                                case 5:
                                    break;

                            }

                        }
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_yes_7);
      
                }

                break;

            case no:
                switch(temp_index)
                {
                    case event_index_1:
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_no_1);
                    case event_index_2:
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_no_2);
                    case event_index_3:
                        my_creature.mental *= (float)6/5;
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_no_3);
                    case event_index_4:
                        my_creature.obedience *=(float)3/10;
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_no_4);
                    case event_index_5:
                        my_creature.hunger *=(float)9/10;
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_no_5);
                    case event_index_6:
                        my_creature.obedience *=(float)3/2;
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_no_6);
                    case event_index_7:
                        my_job.cool_day = 0;
                        return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience,event_result_no_7);


                }


                break;


        }
    }
    return new return_value_event(my_creature.hunger,my_creature.mental,my_creature.health,my_creature.obedience," ");
}
class event
{
    event_element []event_table;//�� �ø� �� ����
    int temp_index;
    public event()
    {
        event_table = new event_element[event_num];
        temp_index = -1; //�߻� ���ߴٴ� ��
        event_table[0] = new event_element(event_name_1,event_text_1,event_result_yes_1,event_result_no_1);
        event_table[1] = new event_element(event_name_2,event_text_2,event_result_yes_2,event_result_no_2);
        event_table[2] = new event_element(event_name_3,event_text_3,event_result_yes_3,event_result_no_3);
        event_table[3] = new event_element(event_name_4,event_text_4,event_result_yes_4,event_result_no_4);
        event_table[4] = new event_element(event_name_5,event_text_5,event_result_yes_5,event_result_no_5);
        event_table[5] = new event_element(event_name_6,event_text_6,event_result_yes_6,event_result_no_6);
        event_table[6] = new event_element(event_name_7,event_text_7,event_result_yes_7,event_result_no_7);

    }

 
    //���� �´��� �𸣰���
    //���⿡ �̺�Ʈ ���̺�
    //�������̽����� �̺�Ʈ Ŭ������ �̺�Ʈ ȣ���Լ��� ȣ���ϸ� ������ �̿��� �̺�Ʈ�� ȣ��
    //�������̽����� �� ���̾�α� �ڽ��� ����� �Է¹޾� ������ ������
}
class creature
{
    int ending_stat = 1;
    int hunger = 0; //���
    int health = 0; //�ǰ�
    int obedience = 0; //������
    int mental = 0; //���Űǰ�
    public int type = 0;
    int ending_flag;
    public void set_ending_stat(int ending_stat)
    {
    	this.ending_stat = ending_stat;
    }
    public int stat_check()
    {
        if(ending_stat == 6)
        {
            switch(my_creature.type)
            {
                case pranc:
                    return clear_ending_pranc;
                case vamp :
                    return clear_ending_vamp;
                case zombie:
                    return clear_ending_zombie;
                default:

                    break;
            }
        }
        if(hunger <= 0 || health <=0 || obedience <= 0|| mental <= 0)
        {
            if(hunger<=0)
            {
                switch(type)
                {
                    case pranc:
                        return bad_ending_hunger_pranc;
                    case vamp:
                        return bad_ending_hunger_vamp;
                    case zombie:
                        return bad_ending_hunger_zombie;
                }
            }
            if(health<=0)
            {
                switch(type)
                {
                    case pranc:
                        return bad_ending_health_pranc;
                    case vamp:
                        return bad_ending_health_vamp;
                    case zombie:
                        return bad_ending_health_zombie;
                }
            }
            if(obedience<=0)
            {
                switch(type)
                {
                    case pranc:
                        return bad_ending_obedience_pranc;
                    case vamp:
                        return bad_ending_obedience_vamp;
                    case zombie:
                        return bad_ending_obedience_zombie;
                }
            }
            if(mental<=0)
            {
                switch(type)
                {
                    case pranc:
                        return bad_ending_mental_pranc;

                    case vamp:
                        return bad_ending_mental_vamp;

                    case zombie:
                        return bad_ending_mental_zombie;


                }
            }
            //����ü���� 0�̵� ���ȿ� ���� �ٸ��� ���� ����
            //���⼭ 0�̵� ������ ���� �ٸ��� ��������
        }
        return still_ok;
    }
    public void limit_restraint()
    {
        if(health>=100)
            health = 100;
        if(mental>=100)
            mental = 100;
        if(obedience>=100)
            obedience =100;
        if(hunger>=100)
            hunger =100;
    }
    public void stat_change(int a)
    {
        int decrease_hunger;
        int decrease_health;
        int decrease_mental;
        int decrease_obedience;
        switch(a)
        {
        case nodoing:
        	
        	break;
            case feed :
                my_creature.hunger +=5;
                my_creature.health+=3;
                break;
            case punish :
                my_creature.obedience+=5;
                my_creature.hunger+=3;
                break;
            case pet:
                my_creature.mental +=5;
                my_creature.health +=3;
                break;
            case syringe:
                my_creature.health+=5;
                my_creature.obedience+=3;
                break;
            case feed_trash:
                my_creature.hunger+=20;
                my_creature.obedience-=7;
                my_creature.health-=7;
                my_creature.mental-=7;
                break;
            case punish_harder:
                my_creature.obedience+=20;
                my_creature.hunger-=7;
                my_creature.health-=7;
                my_creature.mental-=7;
                break;
            case read_story:
                my_creature.mental+=20;
                my_creature.obedience-=7;
                my_creature.health-=7;
                my_creature.hunger-=7;
                break;
            case hard_training:
                my_creature.health+=20;
                my_creature.obedience-=7;
                my_creature.hunger-=7;
                my_creature.mental-=7;
                break;
            case ending:
                int decrease_rate = -20; //���ҵ� ��� ���ҷ�
                int temp_ending; //������ 20%�ε� ��հ��ҷ������� ������
                int ending_flag=-1;
                decrease_hunger = -20;
                decrease_health =-20;
                decrease_mental = -20;
                decrease_obedience = -20;

                if(decrease_health>-(my_creature.health)/2)
                {
                    decrease_health = -(my_creature.health)/2;
                }
                if(decrease_hunger>-(my_creature.hunger)/2)
                {
                    decrease_hunger = -(my_creature.hunger)/2;
                }
                if(decrease_mental>-(my_creature.mental)/2)
                {
                    decrease_mental= -(my_creature.mental)/2;
                }
                if(decrease_obedience>-(my_creature.obedience)/2)
                {
                    decrease_obedience= -(my_creature.obedience)/2;
                }

                my_creature.health +=decrease_health;
                my_creature.obedience +=decrease_obedience;
                my_creature.mental +=decrease_mental;
                my_creature.hunger+= decrease_hunger;

                decrease_rate = -(decrease_health+decrease_obedience+decrease_mental+decrease_hunger)/4;
              //  System.out.println(decrease_rate);
               // decrease_rate +=10;
                temp_ending = (int)(Math.random()*100)+1;
               // System.out.println(temp_ending);
                if(temp_ending < decrease_rate)
                {
                    ending_flag = 1;
                    my_creature.ending_stat+=1;
                } 
                else if (temp_ending>=decrease_rate)
                {
                    ending_flag = 0;
                }
                if(ending_flag==1)
                {
                    my_creature.health -= decrease_health / 3;
                    my_creature.obedience -= decrease_obedience / 3;
                    my_creature.mental -= decrease_mental / 3;
                    my_creature.hunger -= decrease_hunger / 3;
                    // ���� ������ ���� �ణ�� ������
                    ending_flag = 0;
                } //����
            	//my_creature.ending_stat++;
                //���⼭ �ڽ��� ������ 25%�� �Ҹ��ϰ� �Ҹ��� ���ȿ� ���� ���������� ������
                break;
            case special_doctor:
                my_creature.health = 99;
                break;
            case special_soldier:
                my_creature.obedience =99;
                break;

            case special_mentalist:
                my_creature.mental = 99;
                break;
            case special_farmer:
                my_creature.hunger = 99;
                break;
        }
    }
    public void stat_decrease()
    {
        switch(type)
        {
            case pranc:
                my_creature.hunger -= decrease_hunger_pranc;
                my_creature.obedience -= decrease_obedience_pranc;
                my_creature.mental-=decrease_mental_pranc;
                my_creature.health -=decrease_health_pranc;
                break;
            case vamp :
                my_creature.hunger -= decrease_hunger_vamp;
                my_creature.obedience -= decrease_obedience_vamp;
                my_creature.mental-= decrease_mental_vamp;
                my_creature.health -=decrease_health_vamp;
                break;
            case zombie:
                my_creature.hunger -= decrease_hunger_zombie;
                my_creature.obedience -= decrease_obedience_zombie;
                my_creature.mental-=decrease_mental_zombie;
                my_creature.health -=decrease_health_zombie;
                break;


        }



    }

}
class pranc extends creature
{

    public pranc(int hunger,int health,int obedience, int mental)
    {
        this.hunger = hunger;
        this.health = health;
        this.obedience = obedience;
        this.mental = mental;
    }

}
class vampire extends creature
{
    public vampire(int hunger,int health,int obedience, int mental)
    {
        this.hunger = hunger;
        this.health = health;
        this.obedience = obedience;
        this.mental = mental;
    }
}
class zombie extends creature
{
    public zombie(int hunger,int health,int obedience, int mental)
    {
        this.hunger = hunger;
        this.health = health;
        this.obedience = obedience;
        this.mental = mental;
    }

}
//����ü��
class no_job
{
    public int type;
    public int cool_day;
    public int flag;
    public no_job(){
        type =0;
        cool_day = 0;
        flag = 0;
    }
    public boolean cool_time_check()
    {
        //day�� ����� ���� ��������

        if(cool_day == 0)
        {
            flag = 1;
            cool_day++;
            return true;
        }
        if(cool_day >= 5)
        {
            cool_day = 0;
            return true;
        }
        else
        {
            return false;
        }
    }
    public void cool_time_increase()
    {
        if(flag == 1)
        {
            cool_day++;
        }
    }
    public void passive_adapt(int type)
    {

    }
}
class doctor extends no_job
{
    //����ٰ� Ư���ൿ ����
    //���� ������ �� �нú��Լ� ȣ����
    public void passive_adapt(int type)
    {
        switch(type)
        {
            case pranc:
                decrease_health_pranc *=passive_rate;
                break;
            case vamp:
                decrease_health_vamp *=passive_rate;
                break;
            case zombie:
                decrease_health_zombie *=passive_rate;
                break;

        }
    }
}
class soldier extends no_job
{
    public void passive_adapt(int type)
    {
        switch(type)
        {
            case pranc:
                decrease_obedience_pranc *= passive_rate;
                break;
            case vamp:
                decrease_obedience_vamp *= passive_rate;
                break;
            case zombie:
                decrease_obedience_zombie *=passive_rate;
                break;

        }
    }
}
class farmer extends no_job
{
    public void passive_adapt(int type)
    {
        switch(type)
        {
            case pranc:
                decrease_hunger_pranc *= passive_rate;
                break;
            case vamp:
                decrease_hunger_vamp *= passive_rate;
                break;
            case zombie:
                decrease_hunger_zombie *= passive_rate;
                break;

        }
    }
}
class mentalist extends no_job
{
    public void passive_adapt(int type)
    {
        switch(type)
        {
            case pranc:
                decrease_mental_pranc *= passive_rate;
                break;
            case vamp:
                decrease_mental_vamp *=passive_rate;
                break;
            case zombie:
                decrease_mental_zombie *= passive_rate;
                break;

        }
    }
}
public return_value init_my_creature_job(int a,int b)
{
    switch(a)//����ü
    {
        case pranc :
            
            my_creature = new pranc(first_pranc_hunger,first_pranc_health,first_pranc_obedience,first_pranc_mental);
            my_creature.type =pranc;
            break;
        case vamp :
           
            my_creature = new vampire(first_vamp_hunger,first_vamp_health,first_vamp_obedience,first_vamp_mental);
            my_creature.type = vamp;
            break;
        case zombie:
           
            my_creature = new zombie(first_zombie_hunger,first_zombie_health,first_zombie_obedience,first_zombie_mental);
            my_creature.type = zombie;
            break;

    }
    switch (b)
    {
        case doctor:
           
            my_job = new doctor();
            my_job.type= doctor;
            my_job.cool_day = 0;
            my_job.passive_adapt(my_creature.type);
            break;
        case soldier:
           
            my_job = new soldier();
            my_job.type = soldier;
            my_job.cool_day = 0;
            my_job.passive_adapt(my_creature.type);//�׳� ���ļ� �־���
            break;
        case farmer:
          
            my_job = new farmer();
            my_job.type = farmer;
            my_job.cool_day = 0;
            my_job.passive_adapt(my_creature.type);
            break;

        case mentalist:
            my_job  = new mentalist();
            my_job.type = mentalist;
            my_job.cool_day = 0;
            my_job.passive_adapt(my_creature.type);
            break;
    }
    my_event = new event();
    ending_text_table[still_ok]=" ";
    ending_text_table[bad_ending_hunger_pranc] = "��⸦ �������� �ڽ��� ��ü��Ʈ�� �� ������ �Ӹ��ۿ� ���� �ʰ� �Ǿ���...";
    ending_text_table[bad_ending_mental_pranc] = "�ڽ��� ������ ����� �ߵ��� ���� ������ �� �Ͷ߷� ���ȴ�...";
    ending_text_table[bad_ending_health_pranc] = "�� ��ü���� �۵��� �����ϰ� ��Ƴ��� �幰�幰�ϰ� �Ǿ� ���ȴ�...";
    ending_text_table[bad_ending_obedience_pranc] = "�ڽ��� �̷��� ���� �ڻ縦 �����ϸ� �ڻ絵 ������ ���� ������� ����� ���ȴ�...";
    ending_text_table[clear_ending_pranc] = "������ ��Ű�� �������Ⱑ �Ǿ� ���� ���� ã�ƿ��� �������� ���Դ� ������ �Ǿ���!!!";
    ending_text_table[bad_ending_hunger_vamp] = "���ָ��� �������� �ڻ��� �Ǹ� �������� ������ �Ƕ� ���ߵ����� ��������...";
    ending_text_table[bad_ending_mental_vamp] = "�Ϻ��� �����̾ �Ǵ°Ϳ� ������ ������ ������ ���ư� ���ȴ�...";
    ending_text_table[bad_ending_health_vamp] = "�ǰ��� ��ȭ�Ǿ� �ø��ø� �δٰ� �簡�Ǿ� �������...";
    ending_text_table[bad_ending_obedience_vamp] = "�ڻ��� ��ó�� Ż������ ���� �¾��� ������ ������ ����� ������ ��ü�� ������ �߽ɺη� ����Ǿ� ���̵Ǿ� �������ȴ�...";
    ending_text_table[clear_ending_vamp] = "�Ϻ��� �����̾ �Ǹ� ������ ���� ��� ����ó�� ���ε��� �Ǹ� ���� ������ �Ǿ���!!!";
    ending_text_table[bad_ending_hunger_zombie] = "���ָ��� �������� ���� �ڻ縦 �Ծ���ȴ�...";
    ending_text_table[bad_ending_mental_zombie] = "���� ���� ���� ���θ� ��ģ���� ������ ���е� ��ü�ۿ� ���� �ʰԵǾ���...";
    ending_text_table[bad_ending_health_zombie]  ="������ ��ü�� ��� ���巯�� ���̻� �������� ���ϰ� �Ǿ���...";
    ending_text_table[bad_ending_obedience_zombie] = "���� �ڻ��� ���踦 ��� �ְ����� Ż���� ���ȴ�...";
    ending_text_table[clear_ending_zombie] = "32������ ���� ���� ���ø� �����Ͽ� ���� ������ Ȯ���� �η��� 90%�� �پ�����!!!";
    ending_text_table[bad_over_ending] = "������ �־��� ���ð��� �ٽ���ȴ�...";
    r_v = new return_value(my_creature.ending_stat,still_ok,my_creature.hunger,my_creature.health,my_creature.obedience,my_creature.mental,1,ending_text_table[still_ok]);
    return r_v;

}
public boolean cool_check()
{
	return my_job.cool_time_check();
}
public boolean event_check()
{
	 int occur_or_not = 25;
	 
     if(occur_or_not<(int)(Math.random()*100))
     {
    	 //System.out.println("true");
         return true;
         //�̺�Ʈ �߻�����
     }
    // System.out.println("false");
     return false;
}
public return_value load_my_creature(int monster,int job, int hunger,int health,int obedience,int mental,int day, int ending)
{
	
	 switch(monster +1)//����ü
	    {
	
	        case pranc :
	        	
	            my_creature = new pranc(hunger,health,mental,obedience);
	            my_creature.type =pranc;
	            break;
	        case vamp :
	           
	            my_creature = new vampire(hunger,health,mental,obedience);
	            my_creature.type = vamp;
	            break;
	        case zombie:
	           
	            my_creature = new zombie(hunger,health,mental,obedience);
	            my_creature.type = zombie;
	            break;

	    }
	 	my_creature.set_ending_stat(ending);
	    switch (job+1)
	    {
	        case doctor:
	           
	            my_job = new doctor();
	            my_job.type= doctor;
	            my_job.cool_day = 0;//�ε�Ư��!!!!!
	            my_job.passive_adapt(my_creature.type);
	            break;
	        case soldier:
	           
	            my_job = new soldier();
	            my_job.type = soldier;
	            my_job.cool_day = 0;
	            my_job.passive_adapt(my_creature.type);//�׳� ���ļ� �־���
	            break;
	        case farmer:
	          
	            my_job = new farmer();
	            my_job.type = farmer;
	            my_job.cool_day = 0;
	            my_job.passive_adapt(my_creature.type);
	            break;

	        case mentalist:
	            my_job  = new mentalist();
	            my_job.type = mentalist;
	            my_job.cool_day = 0;
	            my_job.passive_adapt(my_creature.type);
	            break;
	    }
	    r_v = new return_value(my_creature.ending_stat,still_ok,my_creature.hunger,my_creature.health,my_creature.obedience,my_creature.mental,day,ending_text_table[still_ok]);
        return r_v;
}
public return_value game_play(int[]a, int b, int day)//�ൿ�� �����ϰ� �ִ� a �迭  b�� ���� �ൿ �÷��� �� Ư���ൿ �÷��� //��Ÿ�Ӱ���Լ� �ʿ� day : ���� ���� ����
{
    int ending_flag;
    //System.out.printf("%d\n", day);
    if(day == 30)
    {
    	//  System.out.printf("%d\n", day);
    	ending_flag = bad_over_ending;
    	 r_v = new return_value(my_creature.ending_stat,ending_flag,my_creature.hunger,my_creature.health,my_creature.obedience,my_creature.mental,day,ending_text_table[ending_flag]);
         return r_v;
    }
    if(b==1)//������
    {
        my_creature.stat_change(a[0]);
    }
    if(b==2)//Ư���ൿ
    {
        my_creature.stat_change(a[0]);
        day++;
        r_v = new return_value(my_creature.ending_stat,still_ok,my_creature.hunger,my_creature.health,my_creature.obedience,my_creature.mental,day,ending_text_table[still_ok]);
        return r_v;
    }
    else if(b ==0)
    {
        for (int i = 0; i < 3; i++)
        {
            my_creature.stat_change(a[i]);
        }
        //�ൿ �迭�� �Է¹޾Ƽ� ������ ������
        my_creature.stat_decrease();
    }
    my_job.cool_time_increase();
    my_creature.limit_restraint();
    ending_flag = my_creature.stat_check();
    //System.out.printf("%d\n", ending_flag);
    r_v = new return_value(my_creature.ending_stat,ending_flag,my_creature.hunger,my_creature.health,my_creature.obedience,my_creature.mental,++day,ending_text_table[ending_flag]);
    return r_v;
}
}