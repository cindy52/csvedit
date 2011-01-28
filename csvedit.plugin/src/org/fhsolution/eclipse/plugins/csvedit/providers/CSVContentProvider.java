package org.fhsolution.eclipse.plugins.csvedit.providers;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.fhsolution.eclipse.plugins.csvedit.model.CSVFile;

/**
 *
 * @author fhenri
 *
 */
public class CSVContentProvider implements IStructuredContentProvider {

    /**
     * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
     */
    public Object[] getElements(Object element) {

        if(element instanceof CSVFile) {
            CSVFile model = (CSVFile) element;
            return model.getArrayRows();
        }
        return null;
    }

    /**
     * @see org.eclipse.jface.viewers.IContentProvider#dispose()
     */
    public void dispose() {
    }

    /**
     * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
     */
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }
}