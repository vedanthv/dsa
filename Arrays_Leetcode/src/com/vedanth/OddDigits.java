 int result = 0;

        if(nums.length == 0){

            return result;
        }


        for(int i = 0; i < nums.length; i++){

            int current = nums[i];
            int check = 0;

            while(current > 0){

                current = current/10;
                check++;
            }

            if(check%2 != 0){
                result++;
            }

        }

        return result;
    }
}
