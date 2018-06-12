package com.basic;
	public class Animal implements IOwner{

		public int getSpeed() {
			// TODO Auto-generated method stub
			return 0;
		}

		public String ownerName() {
			// TODO Auto-generated method stub
			return null;
		}

		
		
	}
	class Cat extends Animal
	{
		@Override
		public int getSpeed() {
			int i = 0;
			// TODO Auto-generated method stub
			return i+10;
		}

		@Override
		public String ownerName() {
			// TODO Auto-generated method stub
			return "Cat Owner";
		}
	}

	class Dog extends Animal
	{
		private int i;

		@Override
		public int getSpeed() {
			// TODO Auto-generated method stub
			return i+20;
		}

		@Override
		public String ownerName() {
			// TODO Auto-generated method stub
			return "Dog Owner";
		}
	}

	class Tiger extends Animal
	{
		private int i;

		@Override
		public int getSpeed() {
			// TODO Auto-generated method stub
			return i+30;
		}

		@Override
		public String ownerName() {
			// TODO Auto-generated method stub
			return "Tiger Owner";
		}
	}

