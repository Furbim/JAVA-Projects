package program;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import entities.Comments;
import entities.posts;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime data = LocalDateTime.parse("27/01/2024 18:36:27", fmt);

		posts post = new posts(data, "Comendo Veneno de Formiga", "Morri?", 37);
		for (int i = 0; i < 3; i++) {
			Comments comment = new Comments("Fake");
			post.addComments(comment);

		}
		
		System.out.println(post.toString());
	}

}
