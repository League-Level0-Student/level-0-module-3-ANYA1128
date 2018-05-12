package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String sign = JOptionPane.showInputDialog(null, "What is your star sign?");

if (sign.equalsIgnoreCase("aries")) {
JOptionPane.showMessageDialog(null, "As The Moon enters your house today listen "
		+ "when you receive feedback you dont like, it could be true." + 
		"" + 
		"The Moon enters Aries today and Mercury is square with Mars,"
		+ " giving you high energy. Just remember others dont "
		+ "have such fire today and may lag behind you, "
		+ "be compassionate and considerate. "
		+ "You may receive some feedback that you dont like, perhaps"
		+ " because its not how you see yourself. Listen and be humble, "
		+ "you may find you can take some of this on board.");
}
if (sign.equalsIgnoreCase("taurus")) {
JOptionPane.showMessageDialog(null, "As The Sun ends its time in trine with Pluto today, others want to be with you and will embrace your ideas.\n" + 
		"\n" + 
		"The Sun in Taurus ends its time in trine with Pluto today, making your energy attractive and causing others to want to be around you. This makes it a good time to make any suggestions you feel nervous about. You are much more likely to get a good response today and others will embrace your ideas and be enthusiastic about your plans. Make the most of this.");
}
if (sign.equalsIgnoreCase("gemini")) {
JOptionPane.showMessageDialog(null, "Bring humour to a low energy atmosphere today and others will respond with equal fun.\n" + 
		"\n" + 
		"There may be a feeling of black clouds gathering around you today, but its unclear if this atmosphere is due to anything solid or just some fuzzy energy going around. Either way, you can bring the sunshine by letting your humour lift the spirits of those around you. Bring some fun into everything you do and others will respond in the same way.");
}
if (sign.equalsIgnoreCase("cancer")) {
JOptionPane.showMessageDialog(null, "Youll have more energy for getting things done today, but when it comes to exercise youll need to take it slower.\n" + 
		"\n" + 
		"You are likely to feel less pressured today, even if you still have a lot to do, as your energy will rise and youll find it much easier to get through tasks and be productive. You can attack your work load and push yourself into it, but if you are using some of your energy for fitness youll need to be a little more careful. Ease into any new exercise regime slowly.\n" + 
		"\n" + 
		"");
		
}
if (sign.equalsIgnoreCase("leo")) {
JOptionPane.showMessageDialog(null, "Today you can find greater intimacy in your relationships by making yourself more vulnerable.\n" + 
		"\n" + 
		"Youll receive the energy you need today to put yourself out there a bit more in your relationships. This could mean making yourself more vulnerable, but its important to be honest and open and a little bit of vulnerability could bring you a lot more intimacy and trust. Use this to repair, maintain, and nurture your relationships and you can take things to a deeper level.\n" + 
		"\n" + 
		"");
}
if (sign.equalsIgnoreCase("virgo")) {
JOptionPane.showMessageDialog(null,"Consider saving some of the extra money you have today, whether a payment or money left over, dont spend it all.\n" + 
		"\n" + 
		"When you gain some extra cash today, make sure you don't waste it. This could be an unexpected payment or it could be that you have more left over than you thought this month. Whatever form this money takes, consider putting some aside and treating yourself with only part of it, rather than all of it. This is smart money sense for your future.");
}
if (sign.equalsIgnoreCase("libra")) {
JOptionPane.showMessageDialog(null,"Take a step back and be patient today when you feel someone is undermining you, all will be revealed.\n" + 
		"\n" + 
		"When you feel like you are being undermined today, take a step back and try to view the situation with some distance. You could be right about this, but equally there could be some paranoia at play. Avoid a negative cycle of thinking and let things settle for a while. If you are right about this and someone is trying to show you up, they will some reveal themselves.\n" + 
		"\n" + 
		"");
}
if (sign.equalsIgnoreCase("scorpio")) {
JOptionPane.showMessageDialog(null,"Minimise your distractions today by concentrating on one thing from your list only.\n" + 
		"\n" + 
		"You need to pick one thing to concentrate on today, and dont let yourself be distracted. You have a long list of things to do, but this list is causing you a lot of indecision and making you procrastinate rather than just getting on with something. Ditch the list and focus on one thing only. Others may want to help you, but even this could be a distraction, so work alone.");
}
if (sign.equalsIgnoreCase("sagittarius")) {
JOptionPane.showMessageDialog(null,"Let your instincts guide you in your work life, just as much as facts and logical thinking do.\n" + 
		"\n" + 
		"When it comes to your work life today, you need your instincts as much as you need facts and information. You often take a very rational and logical approach to your professional life, but your intuition can bring things into the mix that logic cant. Let your sixth sense guide you in your work life and you could find your way to things you would never have discovered otherwise.");
}
if (sign.equalsIgnoreCase("capricorn")) {
JOptionPane.showMessageDialog(null,"With Mars square with Mercury today youll be torn between others wanting your attention and needing to plan for your future.\n" + 
		"\n" + 
		"Mars in Capricorn is square with Mercury today and Pluto ends its time in trine with The Sun. This energy is complex and while you may be in demand from others right now, your energy is directing you to planning for your future. This will create a pull and tug in you and youll have to say no to some people who want your attention. Look to your future and enjoy planning.");
}
if (sign.equalsIgnoreCase("aquarius")) {
JOptionPane.showMessageDialog(null,"When you feel stuck with relationships today, stop and ask yourself where you want this to go.\n" + 
		"\n" + 
		"On relationships issues and relating to others, either at work or in your social circle, youll feel as if you are stuck in limbo and nothing is moving. This could mean its time to reassess where you are with these issues and where you want to get to. When you feel like the situation is going nowhere, stop and do some deep thinking. Where do you want it to go?");
}
if (sign.equalsIgnoreCase("pisces")) {
JOptionPane.showMessageDialog(null,"When you doubt yourself today, spend time with those close to you and feel how they love you as you are.\n" + 
		"\n" + 
		"You are sensitive today, Pisces, and this is making you doubt yourself and the way others see you. Those closest to you love you exactly how you are and dont want you to change. The only thing that needs to change is your perception of situations. Spend some time with your loved ones and feel their love for you, and take a new approach to how you see yourself.");
}
else {
	JOptionPane.showMessageDialog(null, "That's not a star sign!");
}
}
}
