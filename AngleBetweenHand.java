class AngleBetweenHand{
    public static void main(String[] args){
        System.out.println(cal_angle(12,30));
    }
    
    public static int cal_angle(int hour,int min)
    {
        int h_angle= (int)((hour*60+min)*0.5);
		int m_angle = (min*6);
        int angle = m_angle - h_angle;
        //now calculate minimum angle...
       
		if (angle<0) angle=-angle;
		return Math.min(360-angle,angle);
         
    }
}