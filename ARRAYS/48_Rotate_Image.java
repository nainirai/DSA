public void rotate(int[][] matrix) {

        // T C O(N^2) & S.C O(N^2)
    //     int n=matrix.length;
    //     int m=matrix[0].length;
    //     int rotated[][]=new int[n][m];

    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             rotated[j][m-1-i]=matrix[i][j];
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         System.arraycopy(rotated[i],0,matrix[i],0,n);
    //     }   
    // }

    
    // O(N^2) S.C O(1)
    int n=matrix.length;
    // transpose the matrix
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    }

    // reverse each row of the matrix
    for(int i=0;i<n;i++){
        int left=0;
        int right=n-1;
        while(left<right){
            int temp=matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=temp;
            left++;
            right--;
        }
    }   
  }
}
