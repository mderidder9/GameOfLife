# cs403_16-2_E-proj Life-- v0.0.6
Project work for E hr in Term 16-2, CS403 

The objective of the game is to reach the end of retirement with the most money.

HOW TO PLAY
The start order will be assigned by RNG (Rolling). Each player will roll to move forward, and chose to go to college or get a job. 
	If they go to college, they will start in debt at -$100,000 two turns behind everyone else.
	If they get a job, they will be excluded from some higher paying jobs, indicated on the card  

Every turn characters will roll.  Their car will move forward by the returned value and they will be credited their pay equal to the number of spaces they have traveled times their base salary.  
	red tiles cause a negative event- car breaks down, get sick, divorce 
	green tiles cause a positive event- win the lottery, write a best seller, get promoted
	life tiles cause a life event- chose a new job, get a significant other, have/adopt children
After taking their money and cards, they can chose to buy stocks or insurance.

after reaching the end, your money goes in the bank and will increase at a rate of 10% per turn until all people have reached the end.  The winner is determined by whoever has the most money at the end.

ITEMS

	Car-your marker on the road of life-denoted by your initial
	
	Job- 10 jobs, each with a different base pay, some have extra bonuses
		Betamax repairman- 2500, stock in 1
		Caddy- 3000, college
		Bartender-3500, college
		TV repairman- 4000
		Taxi driver- 5500, stock in 10
		Office Peon- 6000, college
		Yelp Reviewer- 1, get 7499 for everyone that goes over a place you already went over
		Youtube celebrity- 1000*# of spaces 
		Movie Star- 1000*(# of spaces/2)^2
		Transpo Officer- 10000, stock in everything, college

	Events
		positive-	won lottery:30000
					found diamonds in garden:10000
					wrote bestseller book:40000
					inheritance:50000
					invented new cryptocurrancy:100000
		negative- 	car breaks down:-50000
					got sick-25000
					joined a pyramid shceme-75000
					took up smoking-75000
					lottery ticket addiction-50000
					drunken stock deal-lose all stocks gain .5 value
		life event- get married:$25000 in gifts
					arrested for polygamy:lose 25% of assets
					have children: -$5000
					lost job: reroll job +$10000 
					promoted: base pay increases by 25%
					quit: reroll job

	Game Board 
					45% good
					30% bad
					25% life
					The board is a stright line with spaces containing letters denoting their effect.
					If a space has been reviewed by the yelper, it will have a row of **** denoting his trail of destruction


	Stocks- Can buy a stock for 25000
			if someone rolls that amount earn 10000
			can resell for 30000 but can't buy and sell on the same turn

	Insurance- Can buy for 20000-each one cancels out the corsponding issue  
				auto
				medical
				financial advisor
				medically induced nicotine intolerance 
				CS:GO addiction
				stock broker

Works Cited
"The Game of LIFE Instructions." Hasbro.com. Milton Bradley Company, 1991. Web. 