package roomescape.reservation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import roomescape.member.Member;
import roomescape.theme.Theme;
import roomescape.time.Time;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String date;

	@ManyToOne
	private Time time;

	@ManyToOne
	private Theme theme;

	@ManyToOne
	private Member member;

	public Reservation(Long id, String name, String date, Time time, Theme theme) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.time = time;
		this.theme = theme;
	}

	public Reservation(String name, String date, Time time, Theme theme) {
		this.name = name;
		this.date = date;
		this.time = time;
		this.theme = theme;
	}

	public Reservation() {

	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

	public Time getTime() {
		return time;
	}

	public Theme getTheme() {
		return theme;
	}
}
